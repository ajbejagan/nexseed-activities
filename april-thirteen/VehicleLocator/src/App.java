public class App {
    public static void main(String[] args) throws Exception {
        
        Car familyCar = new Car("Xander", "Xpander", "Mitsubishi", 2019, "Casay");

        System.out.println("We are currently at " + familyCar.getLocation());

        familyCar.travel("Lahug");

        System.out.println("We are currently at " + familyCar.getLocation());

    }
}
