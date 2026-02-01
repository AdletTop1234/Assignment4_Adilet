package service.interfaces;

public interface CalorieCalculable {

    double calculateCalories();

    // default method (требование задания)
    default boolean isHealthy() {
        return calculateCalories() < 500;
    }

    // static method (требование задания)
    static void printRule() {
        System.out.println("Healthy food < 500 calories");
    }
}

