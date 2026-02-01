import controller.DishController;
import model.BaseDish;
import model.Bolognese;
import model.Ingredient;
import model.Risotto;
import repository.DishRepository;
import repository.interfaces.CrudRepository;
import service.DishServiceImpl;
import service.interfaces.CalorieCalculable;
import service.interfaces.DishService;
import service.interfaces.Validatable;
import utils.ReflectionUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CrudRepository<BaseDish> repo = new DishRepository();
        DishService service = new DishServiceImpl(repo);
        DishController controller = new DishController(service);

        List<Ingredient> ingredients = List.of(
                new Ingredient("Rice", 130, 2),
                new Ingredient("Cheese", 400, 0.2)
        );

        BaseDish risotto = new Risotto(1, "Risotto", ingredients);
        BaseDish bolognese = new Bolognese(2, "Bolognese", ingredients);

        controller.createDish(risotto);
        controller.createDish(bolognese);

        controller.showAllDishes();

        Validatable.printRule();
        CalorieCalculable.printRule();

        ReflectionUtils.printClassInfo(risotto);
        ReflectionUtils.printClassInfo(bolognese);
    }
}
