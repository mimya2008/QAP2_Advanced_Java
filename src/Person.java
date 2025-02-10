public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // Getters
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getHome() {
        return home;
    }

    // Setters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    // toString method
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
