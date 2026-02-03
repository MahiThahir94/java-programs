import com.bank.finance.*;

public class BankApp {
    public static void main(String[] args) {

        double balance = 100000;

        InterestRate savings = new SavingsAccount();
        InterestRate current = new CurrentAccount();
        InterestRate loan = new LoanAccount();

        System.out.println("Savings Account Monthly Interest: " +
                savings.calculateMonthlyInterest(balance));

        System.out.println("Current Account Monthly Interest: " +
                current.calculateMonthlyInterest(balance));

        System.out.println("Loan Account Monthly Interest: " +
                loan.calculateMonthlyInterest(balance));
    }
}