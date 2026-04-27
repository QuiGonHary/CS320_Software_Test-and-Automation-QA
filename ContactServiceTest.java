/*
 * I reviewed, tested, and validated all code myself.
 */

package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ContactService.Contact;
import ContactService.ContactService;

// Tests for the ContactService class
public class ContactServiceTest {

    @Test
    public void testAddContactWorks() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(c);
        // If no exception, it worked
        assertTrue(true);
    }

    @Test
    public void testAddDuplicateIDThrows() {
        ContactService service = new ContactService();
        Contact c1 = new Contact("1", "John", "Smith", "1234567890", "123 Main St");
        Contact c2 = new Contact("1", "Mike", "Jones", "0987654321", "456 Oak Rd");

        service.addContact(c1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(c2);
        });
    }

    @Test
    public void testDeleteContactWorks() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(c);
        service.deleteContact("1");

        // Now deleting again should throw
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("1");
        });
    }

    @Test
    public void testDeleteBadIDThrows() {
        ContactService service = new ContactService();
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("nope");
        });
    }

    @Test
    public void testUpdateFirstName() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(c);
        service.updateFirstName("1", "Mike");

        assertEquals("Mike", c.getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(c);
        service.updateLastName("1", "Jones");

        assertEquals("Jones", c.getLastName());
    }

    @Test
    public void testUpdatePhone() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(c);
        service.updatePhone("1", "0987654321");

        assertEquals("0987654321", c.getPhone());
    }

    @Test
    public void testUpdateAddress() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(c);
        service.updateAddress("1", "456 Oak Rd");

        assertEquals("456 Oak Rd", c.getAddress());
    }

    @Test
    public void testUpdateBadIDThrows() {
        ContactService service = new ContactService();
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("nope", "Test");
        });
    }
}
