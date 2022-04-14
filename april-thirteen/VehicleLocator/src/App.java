public class App {
    public static void main(String[] args) throws Exception {

        printBorder(1);

        // activity 1
        
        Car familyCar = new Car("Xpander", "GLS Sport A/T", "Mitsubishi", 2019, "Casay");

        System.out.println("=================================================="); // ignore this line, for formatting purposes only
        System.out.println("We are currently at " + familyCar.getCurrentLocation());
        familyCar.travel("Lahug");
        System.out.println("We are currently at " + familyCar.getCurrentLocation());
        System.out.println("=================================================="); // ignore this line, for formatting purposes only

        printBorder(2);

        // activity 2

        String[] carNames = {"car1", "car2", "car3", "car4", "car5"};
        String[] carModels = {"model1", "model2", "model3", "model4", "model5"};
        String[] carBrands = {"brand1", "brand2", "brand3", "brand4", "brand5"};
        int[] years = {1991, 1992, 1993, 1994, 1995};
        String[] currentLocations = {"Naga", "San Fernando", "Carcar", "Sibonga", "Argao"};
        String[] travelLocations = {"Colon", "Fuente", "Mabolo", "Banawa", "Tisa"};

        Car[] cars = new Car[5];

        System.out.println("=================================================="); // ignore this line, for formatting purposes only
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(carNames[i], carModels[i], carBrands[i], years[i], currentLocations[i]);
            if (i != 0) {
                System.out.println("=================================================="); // ignore this line, for formatting purposes only
            }
            System.out.println("We are currently at " + cars[i].getCurrentLocation());
            cars[i].travel(travelLocations[i]);
            System.out.println("We are currently at " + cars[i].getCurrentLocation());
            if (i == (cars.length)) {
                System.out.println("=================================================="); // ignore this line, for formatting purposes only
            }
        }
        System.out.println("=================================================="); // ignore this line, for formatting purposes only

        // for (int i = 0; i < cars.length; i++) {
        //     System.out.println(cars[i].getName());
        //     System.out.println(cars[i].getModel());
        //     System.out.println(cars[i].getBrand());
        //     System.out.println(cars[i].getYear());
        //     System.out.println(cars[i].getLocation());
        // }

        printBorder(3);

        // activity 3

        Car dreamCar = new Car("Camry", "Camry 2.5 V HEV", "Toyota", 2022, "Lahug", 10);

        System.out.println("=================================================="); // ignore this line, for formatting purposes only
        dreamCar.travel();
        System.out.println("The remaining gas after traveling to " + dreamCar.getCurrentLocation() + " from " + dreamCar.getPrevLocation() + " is " + dreamCar.getGas());
        System.out.println("=================================================="); // ignore this line, for formatting purposes only

    }

    public static void printBorder(int activityNumber) {
        System.out.println(""); // ignore this line, for formatting purposes only
        System.out.println(""); // ignore this line, for formatting purposes only
        System.out.println("******************* Activity " + activityNumber + " *******************"); // ignore this line, for formatting purposes only
        System.out.println(""); // ignore this line, for formatting purposes only
        System.out.println(""); // ignore this line, for formatting purposes only
    }
}
