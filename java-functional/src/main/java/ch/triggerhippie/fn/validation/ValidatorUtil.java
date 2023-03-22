package ch.triggerhippie.fn.validation;

import java.util.function.Function;

public class ValidatorUtil {

    public static <T> Function<ItemValidation<T>, ItemValidation<T>> validateNotNullFn() {
        return itemValidation -> {
            if (!itemValidation.result || itemValidation.value != null) {
                return itemValidation;
            }
            return new ItemValidation<>("Value is null", null);
        };
    }

    public static Function<ItemValidation<String>, ItemValidation<String>> string_validateNotEmptyFn() {
        return itemValidation -> {
            if (!itemValidation.result || !itemValidation.value.trim().equals("")) {
                return itemValidation;
            }
            return new ItemValidation<>("Value is empty", itemValidation.value);
        };
    }


    public static Function<ItemValidation<String>, ItemValidation<String>> string_validateMaxLengthFn(Integer maxLength) {
        return itemValidation -> {
            if (!itemValidation.result || itemValidation.value.length() <= maxLength) {
                return itemValidation;
            }
            return new ItemValidation<>("Value is too long", itemValidation.value);
        };
    }

}
