public class Transactions {
    
    public static void checkBalance() {
        // check balance code here
    }

    public static double deposit(double funds, double amount) {

    double newAmount = funds;

    if (amount < 500) {
        System.out.println("Sorry, amount should be higher than ₱500 to make a deposit.");
    } else {
        newAmount = funds + amount;
    }

    return newAmount;

    }

    public static double withdrawFunds(double funds, double amount) {

    double newAmount = funds;

    if (amount < 500) {
        System.out.println("Sorry, amount should be higher than ₱500 to make a withdrawal.");
    } else if (amount > funds) {
        System.out.println("Insufficient balance. Amount should be lower than your total balance to make a withdrawal.");
    } else {
        newAmount = funds - amount;
    }

    return newAmount;

    }

    public static void displayExitMessage() {
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*        Thank you for banking with us!          *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
        System.out.println("");
    }

}
