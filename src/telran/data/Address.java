package telran.data;

public class Address {
    private String streetName;
    private int homeNumber;

    public Address(String streetName, int homeNumber) {
        this.streetName = streetName;
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "Address: " + streetName + ", Home namber is " +homeNumber;
    }
}
