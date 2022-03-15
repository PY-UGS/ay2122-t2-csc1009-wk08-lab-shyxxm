public class CheckingAccount {

    public double balance;
    public double number;

    public CheckingAccount() {

    }

    public double deposit(double amount) {

        if (amount <= 0){
            throw new IllegalArgumentException("Deposit money more than 0");
        }
        return balance += amount;
    }

    public boolean withdraw(double amount) throws InsufficientFundsException {

        if (balance < amount) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public double getNumber() {
        return number;
    }
}
