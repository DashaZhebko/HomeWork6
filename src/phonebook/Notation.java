package phonebook;

public class Notation {
    private String name;
    private long phoneNumber;

    public Notation(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Notation: " +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber;
    }
}
