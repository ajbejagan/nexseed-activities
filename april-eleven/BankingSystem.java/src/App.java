import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    String userName;
    double funds = 10000;
    String currency = "PHP";
    String[] currencies = {"PHP", "JPY", "USD"};
    double exitTransaction = 0;

    Scanner sc = new Scanner(System.in);

    // ask user for name to proceed with bank account creation
    System.out.println("Please provide your full name to create your bank account: ");
    userName = sc.nextLine();
    // user greeting and provide navigation options for user
    System.out.println("Welcome to the Bank of Lahug online banking " + userName + "!");
    
    while (exitTransaction < 1) {
      double[] values = transactionScreen(userName, funds, currency, currencies, sc, exitTransaction);
      funds = (double) values[0];
      exitTransaction = values[1];
    }
    
    sc.close();

  }

  // user transaction

  public static double[] transactionScreen(String userName, double funds, String currency, String[] currencies, Scanner sc, double exitTransaction) {

    double newAmount = funds;
    double[] values = new double[2];
    values[1] = exitTransaction;
    int optionSelected;

    System.out.println("What would you like to do next?");
    System.out.println("Press 0: to display account information and end transaction.");
    System.out.println("Press 1: to display account information.");
    System.out.println("Press 2: to make a deposit.");
    System.out.println("Press 3: to make a withdrawal.");
    System.out.println("Press 4: to convert funds.");
    // accept user generated option
    optionSelected = sc.nextInt();
    sc.nextLine();

    switch(optionSelected) {

      case 0:
      values[1] = 1;
        displayInformation(userName, newAmount, currency);
        break;

      case 1:
        displayInformation(userName, newAmount, currency);
        break;

      case 2:

        System.out.println("Please provide the amount you would like to deposit.");
        double deposit = sc.nextDouble();
        sc.nextLine();
        newAmount = addFunds(newAmount, deposit);
        displayInformation(userName, newAmount, currency);
        break;

      case 3:
        System.out.println("Please provide the amount you would like to withdraw.");
        double withdrawal = sc.nextDouble();
        newAmount = withdrawFunds(newAmount, withdrawal);
        displayInformation(userName, newAmount, currency);
        break;

      case 4:
        System.out.println("Please provide the currency in which you want to convert the funds into: ");
        // provide currency option for the user
        for (int i = 0; i < currencies.length; i++) {
          if (currency != currencies[i]) {
            System.out.println("Type : " + currencies[i] + " for " + currencies[i]);
          }
        }
        String newCurrency = sc.nextLine();
        newAmount = convertFunds(newAmount, currency, newCurrency);
        currency = newCurrency;
        displayInformation(userName, newAmount, currency);
        break;

      default:
        System.out.println("The option you entered is invalid.");

    }

    values[0] = newAmount;

    return values;

  }

  // display account info

  public static void displayInformation(String userName, double funds, String currency) {
    System.out.println("");
    System.out.println("==================================================");
    System.out.println("");
    System.out.println("Hello " + userName + "! Your available funds amount to " + currency + funds);
    System.out.println("");
    System.out.println("==================================================");
    System.out.println("");
  }

  // deposit amount to the account

  public static double addFunds(double funds, double deposit) {

    double newAmount = funds;

    if (deposit < 500) {
      System.out.println("Amount should be higher than ₱500 to make a deposit.");
    } else {
      newAmount = funds + deposit;
    }

    return newAmount;

  }

  // withdraw amount from the account

  public static double withdrawFunds(double funds, double withdrawal) {

    double newAmount = funds;

    if (withdrawal < 500) {
      System.out.println("Amount should be higher than ₱500 to make a withdrawal.");
    } else if (withdrawal > funds) {
      System.out.println("Amount should be lower than your total funds to make a withdrawal.");
    } else {
      newAmount = funds - withdrawal;
    }

    return newAmount;

  }

  // convert funds from one currency to another

  public static double convertFunds(double funds, String currency, String newCurrencyOption) {

    double newAmount = funds;

    if (currency == newCurrencyOption) {
      System.out.println("No conversions to be made.");
    } else {
      System.out.println(funds);
      switch(newCurrencyOption) {

        case "PHP":
          if (currency == "JPY") {
            newAmount = funds * 0.42;
          } else if (currency == "USD") {
            newAmount = funds * 52.08;
          }
          break;

        case "JPY":
          if (currency == "PHP") {
            newAmount = funds * 2.41;
          } else if (currency == "USD") {
            newAmount = funds * 0.0080;
          }
          break;

        case "USD":
          if (currency == "PHP") {
            newAmount = funds * 0.019;
          } else if (currency == "JPY") {
            newAmount = funds * 125.49;
          }
          break;

        default:
          System.out.println("The option you entered is invalid.");
          
      }
    }

    return newAmount;
  }

}