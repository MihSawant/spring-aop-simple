package service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PizzaService {

    private void bakePizza(){
        try{
            System.out.println("Pizza is Baking....");
            Thread.sleep(2000);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void makePizza(String name, String... toppings){
        bakePizza();
        System.out.println("Your pizza is Ready {%s} with toppings %s ".formatted(name,
                Arrays.toString(toppings)));

    }
}
