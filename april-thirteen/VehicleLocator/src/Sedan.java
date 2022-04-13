import java.util.Scanner;

public class Sedan extends Car {

  private double gas;

  Sedan(String name, String model, String brand, int year, String location, double gas) {
    super(name, model, brand, year, location);
    this.gas = gas;
  }

  public void travel() {
    Scanner sc = new Scanner(System.in);
    // Ask the place to travel to
    System.out.println("Provide the location you are headed to: ");
    String newLocation = sc.nextLine();
    // Set the location to the place traveled
    Sedan.this.setLocation(newLocation);
    // Ask the double distance
    System.out.println("Provide the distance from where you are currently at to where you are headed: ");
    double distance = sc.nextDouble();
    sc.nextLine();
    // Set the gas of the car to gas deducted by the gas used
    this.gas = calculateGasUsed(distance);
  }

  public double calculateGasUsed(double distance) {
    double gasPerLiter = 15.5;
    double gasUsed = distance / gasPerLiter;
    return this.gas - gasUsed;
  }

  public double getGas() {
    return gas;
  }

  public void setGas(double gas) {
    this.gas = gas;
  }

}
