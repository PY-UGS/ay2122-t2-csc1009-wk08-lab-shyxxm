import java.util.Scanner;

public class BankDemoTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CheckingAccount account = new CheckingAccount();

        try {
            System.out.print("Enter amount to deposit: ");
            account.deposit(input.nextDouble());
            System.out.print("Enter amount to withdraw: ");

            if (account.withdraw(input.nextDouble())) {
                System.out.println("The balance after withdraw is: $" + account.getBalance());
            }

        } catch (InsufficientFundsException i) {
            System.out.println("Sorry, but your account is short by: $" + i.getAmount());
        }

        input.close();

    }

}
