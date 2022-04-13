public class Car {
  private String name;
  private String model;
  private String brand;
  private int year;
  private String location;

  Car(String name, String model, String brand, int year, String location) {
    this.name = name;
    this.model = model;
    this.brand = brand;
    this.year = year;
    this.location = location;
  }

  public void travel(String place) {
    System.out.println("We just arrived at " + place);
    this.location = place;
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

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  
}
