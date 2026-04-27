/*
 * I reviewed, tested, and validated all code myself.
 */

package ContactService;

// Basic contact class with validation on all fields
public class Contact {

    // ID can't change once it's set
    private final String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor with validation checks
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {

        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("bad id");
        }

        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("bad first name");
        }

        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("bad last name");
        }

        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("bad phone");
        }

        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("bad address");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters
    public String getContactID() { return contactID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    // Update methods (ID never changes)
    public void updateFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("bad first name");
        }
        this.firstName = firstName;
    }

    public void updateLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("bad last name");
        }
        this.lastName = lastName;
    }

    public void updatePhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("bad phone");
        }
        this.phone = phone;
    }

    public void updateAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("bad address");
        }
        this.address = address;
    }
}
