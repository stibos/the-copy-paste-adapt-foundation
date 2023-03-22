package ch.triggerhippie.fn;

import ch.triggerhippie.fn.validation.AddressValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddressValidatorTest {

    @Test
    public void testValidateFirstName() {
        assertTrue(AddressValidator.validateFirstName("Nik").result);

        assertFalse(AddressValidator.validateFirstName("John").result);
        assertFalse(AddressValidator.validateFirstName(null).result);
        assertFalse(AddressValidator.validateFirstName(" ").result);
    }

}
