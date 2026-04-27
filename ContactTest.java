/*
 * I reviewed, tested, and validated all code myself.
 */

package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ContactService.Contact;

// Tests for the Contact class
public class ContactTest {

    @Test
    public void testContactCreationWorks() {
        Contact c = new Contact("12345", "John", "Smith", "1234567890", "123 Main St");

        assertEquals("12345", c.getContactID());
        assertEquals("John", c.getFirstName());
        assertEquals("Smith", c.getLastName());
        assertEquals("1234567890", c.getPhone());
        assertEquals("123 Main St", c.getAddress());
    }

    @Test
    public void testBadIDThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Smith", "1234567890", "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Smith", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testBadFirstNameThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", null, "Smith", "1234567890", "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "ThisNameIsWayTooLong", "Smith", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testBadLastNameThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", null, "1234567890", "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "ThisIsTooLong", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testBadPhoneThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "Smith", null, "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "Smith", "123", "123 Main St");
        });
    }

    @Test
    public void testBadAddressThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "Smith", "1234567890", null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "Smith", "1234567890",
                "This address is definitely more than thirty characters long");
        });
    }

    @Test
    public void testUpdateMethodsWork() {
        Contact c = new Contact("1", "John", "Smith", "1234567890", "123 Main St");

        c.updateFirstName("Mike");
        assertEquals("Mike", c.getFirstName());

        c.updateLastName("Jones");
        assertEquals("Jones", c.getLastName());

        c.updatePhone("0987654321");
        assertEquals("0987654321", c.getPhone());

        c.updateAddress("456 Oak Rd");
        assertEquals("456 Oak Rd", c.getAddress());
    }
}
