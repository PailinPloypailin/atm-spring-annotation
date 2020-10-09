package th.ac.kmitl.atm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ATM {
    private final Bank bank;
    private Customer loginCustomer;


    @Autowired
    public ATM(Bank bank) {
        this.bank = bank;
        this.loginCustomer = null;
    }

    public String validateCustomer(int id, int pin) {
        Customer customer = bank.findCustomer(id);

        if (customer != null && customer.checkPin(pin)) {
            loginCustomer = customer;
            return loginCustomer.getName();
        }
        return null;
    }

    public void withdraw(double amount) {
        loginCustomer.getAccount().withdraw(amount);
    }

    public double getBalance() {
        return loginCustomer.getAccount().getBalance();
    }


}
