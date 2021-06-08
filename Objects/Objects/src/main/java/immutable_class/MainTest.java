package immutable_class;

public class MainTest {

    public static void main(String[] args) {
        Address address = new Address();
        address.setAddressLine("Address line 1");
        address.setCity("Test City");
        address.setState("Test State");
        address.setPinCode("123456");

        ImmutableEmployee immutableEmployee = new ImmutableEmployee("Jai", 10, address);

        System.out.println(immutableEmployee.getName() +
                "'s city before modification: " + immutableEmployee.getAddress().getCity());
        address.setCity("Modified City");
        System.out.println(immutableEmployee.getName() +
                "'s city after modification: " + immutableEmployee.getAddress().getCity());


    }
}
