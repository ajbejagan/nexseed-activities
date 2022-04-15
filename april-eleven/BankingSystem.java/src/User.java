public class User {

    private String firstName;
    private String lastName;
    private double funds;

    User(String firstName, String lastName, double funds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.funds = funds;
    }

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.funds = 10000;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    
    
}
