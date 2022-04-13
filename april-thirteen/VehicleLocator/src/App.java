public class App {
    public static void main(String[] args) throws Exception {

        // activity 1
        
        Car familyCar = new Car("Xpander", "GLS Sport A/T", "Mitsubishi", 2019, "Casay");

        System.out.println("=================================================="); // ignore this line, for formatting purposes only
        System.out.println("We are currently at " + familyCar.getLocation());
        familyCar.travel("Lahug");
        System.out.println("We are currently at " + familyCar.getLocation());
        System.out.println("=================================================="); // ignore this line, for formatting purposes only

        System.out.println(""); // ignore this line, for formatting purposes only
        System.out.println(""); // ignore this line, for formatting purposes only

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
            System.out.println("We are currently at " + cars[i].getLocation());
            cars[i].travel(travelLocations[i]);
            System.out.println("We are currently at " + cars[i].getLocation());
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

    }
}
