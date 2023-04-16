import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PizzaService;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PizzaService service  = (PizzaService) ctx.getBean("pizzaService");
        String[] toppings = {"Capsicum", "Corn"};
        String pizzaName = "Veg Paradise";
        service.makePizza(pizzaName, toppings);
    }
}
