/*
 * I reviewed, tested, and validated all code myself.
 */

package ContactService;

import java.util.HashMap;

// Service class to store contacts in memory
public class ContactService {

    // Using a HashMap for quick lookups by ID
    private HashMap<String, Contact> contacts = new HashMap<>();

    // Add a new contact (ID must be unique)
    public void addContact(Contact c) {
        if (contacts.containsKey(c.getContactID())) {
            throw new IllegalArgumentException("id already exists");
        }
        contacts.put(c.getContactID(), c);
    }

    // Delete a contact by ID
    public void deleteContact(String id) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("id not found");
        }
        contacts.remove(id);
    }

    // Update methods (contact must exist first)
    public void updateFirstName(String id, String newName) {
        Contact c = contacts.get(id);
        if (c == null) {
            throw new IllegalArgumentException("id not found");
        }
        c.updateFirstName(newName);
    }

    public void updateLastName(String id, String newName) {
        Contact c = contacts.get(id);
        if (c == null) {
            throw new IllegalArgumentException("id not found");
        }
        c.updateLastName(newName);
    }

    public void updatePhone(String id, String newPhone) {
        Contact c = contacts.get(id);
        if (c == null) {
            throw new IllegalArgumentException("id not found");
        }
        c.updatePhone(newPhone);
    }

    public void updateAddress(String id, String newAddr) {
        Contact c = contacts.get(id);
        if (c == null) {
            throw new IllegalArgumentException("id not found");
        }
        c.updateAddress(newAddr);
    }
}
