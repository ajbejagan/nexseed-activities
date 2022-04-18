import java.util.Scanner;

public class Car {
  private String name;
  private String model;
  private String brand;
  private int year;
  private String prevLocation;
  private String currentLocation;
  private double gas = 10;
  private double gasConsumption = 15.5;

  Car(String name, String model, String brand, int year, String currentLocation, double gas, double gasConsumption) {
    this.name = name;
    this.model = model;
    this.brand = brand;
    this.year = year;
    this.prevLocation = currentLocation;
    this.currentLocation = currentLocation;
    this.gas = gas;
    this.gasConsumption = gasConsumption;
  }

  Car(String name, String model, String brand, int year, String currentLocation, double gas) {
    this.name = name;
    this.model = model;
    this.brand = brand;
    this.year = year;
    this.prevLocation = currentLocation;
    this.currentLocation = currentLocation;
    this.gas = gas;
  }

  Car(String name, String model, String brand, int year, String currentLocation) {
    this.name = name;
    this.model = model;
    this.brand = brand;
    this.year = year;
    this.prevLocation = currentLocation;
    this.currentLocation = currentLocation;
  }

  public void travel(String place) {
    System.out.println("We just arrived at " + place);
    this.prevLocation = this.currentLocation;
    this.currentLocation = place;
  }

  public void travel(Scanner sc) {
    // ask user for the place to travel to
    System.out.println("Provide the location you are headed to: ");
    String newLocation = sc.nextLine();
    // set prev location to the currentLocation
    this.prevLocation = this.currentLocation;
    // set the location to the place traveled
    this.currentLocation = newLocation;
    // ask user for the travel distance
    System.out.println("Provide the distance from where you are currently at to where you are headed: ");
    double distance = sc.nextDouble();
    sc.nextLine();

    // set the gas to the remaining available gas
    this.gas = calculateAvailableGas(distance);
  }

  public double calculateAvailableGas(double distance) {
    // calculate gas used
    double gasUsed = distance / gasConsumption;
    // calculate the remaining available gas
    return this.gas - gasUsed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getPrevLocation() {
    return prevLocation;
  }

  public void setPrevLocation(String prevLocation) {
    this.prevLocation = prevLocation;
  }

  public String getCurrentLocation() {
    return currentLocation;
  }

  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }

  public double getGas() {
    return gas;
  }

  public void setGas(double gas) {
    this.gas = gas;
  }
  
  public double getGasConsumption() {
    return gasConsumption;
  }

  public void setGasConsumption(double gasConsumption) {
    this.gasConsumption = gasConsumption;
  }

}
