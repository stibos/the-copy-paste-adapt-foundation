package ch.triggerhippie.fn.validation;

import java.util.function.Function;

import static ch.triggerhippie.fn.validation.ValidatorUtil.*;
import static ch.triggerhippie.fn.validation.ValidatorUtil.validateNotNullFn;

public class AddressValidator {

    private AddressValidator() {
    }

    public static ItemValidation<String> validateFirstName(String firstName) {
        return validateNotEmptyAndMaxLength(firstName, 3);
    }

    public static ItemValidation<String> validateNotEmptyAndMaxLength(String value, Integer maxLength) {
        Function<ItemValidation<String>, ItemValidation<String>> validateNotNullFn = validateNotNullFn();
        return validateNotNullFn
                .andThen(string_validateNotEmptyFn())
                .andThen(string_validateMaxLengthFn(maxLength))
                .apply(new ItemValidation<>(value));
    }
}
