public class SportsCar extends Car {
  private String carSound;

  SportsCar(String name, String model, String brand, int year, String currentLocation, double gas, double gasConsumption, String carSound) {
    super(name, model, brand, year, currentLocation, gas, gasConsumption);
    this.carSound = carSound;
  }

  public String getCarSound() {
    return carSound;
  }

  public void setCarSound(String carSound) {
    this.carSound = carSound;
  }
}
