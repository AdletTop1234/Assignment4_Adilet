package service.interfaces;

public interface Validatable {

    void validate();

    // default method (требование задания)
    default boolean isValid() {
        try {
            validate();
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

    // static method (требование задания)
    static void printRule() {
        System.out.println("Validation rules active");
    }
}
