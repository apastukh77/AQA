package immutable_class;

public class ImmutableEmployee {

    private final String name;
    private final long id;
    private final Address address;

    public ImmutableEmployee(String name, long id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
