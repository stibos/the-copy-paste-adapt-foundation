package ch.triggerhippie.fn.validation;

public class ItemValidation<T> {
    public final String message;
    public final T value;
    public final Boolean result;

    public ItemValidation(String message, T value, Boolean result) {
        this.message = message;
        this.value = value;
        this.result = result;
    }

    public ItemValidation(T value) {
        this.message = "valid";
        this.value = value;
        this.result = true;
    }

    public ItemValidation(String message, T value) {
        this.message = message;
        this.value = value;
        this.result = false;
    }
}
