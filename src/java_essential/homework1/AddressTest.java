package java_essential.homework1;

public class AddressTest {
    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex("04209");
        address.setCountry("Ukraine");
        address.setCity("Kiev");
        address.setStreet("Kovalevskaya st.");
        address.setHouse("24a");
        address.setApartment("167");

        address.viewAddress();
    }
}
