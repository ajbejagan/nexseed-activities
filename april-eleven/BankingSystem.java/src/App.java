import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    String userName;
    double funds = 10000;
    String currency = "PHP";
    String[] currencies = {"PHP", "JPY", "USD"};
    int optionSelected;

    Scanner sc = new Scanner(System.in);

    // ask user for name to proceed with bank account creation
    System.out.println("Please provide your full name to create your bank account: ");
    userName = sc.nextLine();
    // user greeting and provide navigation options for user
    System.out.println("Welcome to the Bank of Lahug online banking " + userName + "! What would you like to do next?");
    System.out.println("Press 0: to display account information.");
    System.out.println("Press 1: to make a deposit.");
    System.out.println("Press 2: to make a withdrawal.");
    System.out.println("Press 3: to convert funds.");
    // accept user generated option
    optionSelected = sc.nextInt();
    sc.nextLine();

    switch(optionSelected) {
      case 0:
        displayInformation(userName, funds, currency);
        break;
      case 1:
        System.out.println("Please provide the amount you would like to deposit.");
        double deposit = sc.nextDouble();
        sc.nextLine();
        funds = addFunds(funds, deposit);
        displayInformation(userName, funds, currency);
        break;
      case 2:
        System.out.println("Please provide the amount you would like to withdraw.");
        double withdrawal = sc.nextDouble();
        funds = withdrawFunds(funds, withdrawal);
        displayInformation(userName, funds, currency);
        break;
      case 3:
        System.out.println("Please provide the currency in which you want to convert the funds into: ");
        // provide currency option for the user
        for (int i = 0; i < currencies.length; i++) {
          if (currency != currencies[i]) {
            System.out.println("Type : " + currencies[i] + " for " + currencies[i]);
          }
        }
        String newCurrency = sc.nextLine();
        funds = convertFunds(funds, currency, newCurrency);
        currency = newCurrency;
        displayInformation(userName, funds, currency);
        break;
      default:
        System.out.println("The option you entered is invalid.");
    }

    sc.close();
    
  }

  public static void displayInformation(String userName, double funds, String currency) {
    System.out.println("Hello " + userName + "! Your available funds amount to " + currency + funds);
  }

  public static double addFunds(double funds, double deposit) {

    double newAmount = funds;

    if (deposit < 500) {
      System.out.println("Amount should be higher than ₱500 to make a deposit.");
    } else {
      newAmount = funds + deposit;
    }

    return newAmount;

  }

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

  public static double convertFunds(double funds, String currency, String newCurrencyOption) {

    double newAmount = funds;

    if (currency == newCurrencyOption) {
      System.out.println("No conversions to be made.");
    } else {
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