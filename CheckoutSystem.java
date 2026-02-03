
class CheckoutSystem {

    static void pay(double balance, double amount)
            throws InsufficientFundsException, NegativeAmountException {

        if (amount < 0)
            throw new NegativeAmountException("Amount cannot be negative");

        if (amount > balance)
            throw new InsufficientFundsException("Insufficient balance");

        System.out.println("Payment successful");
    }

    public static void main(String[] args) {
        double balance = 5000;

        try {
            pay(balance, 6000);
        }
        catch (InsufficientFundsException | NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Database connection closed");
        }
    }
