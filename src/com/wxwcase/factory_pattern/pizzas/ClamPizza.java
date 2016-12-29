package com.wxwcase.factory_pattern.pizzas;

/**
 * Created by wwang on 12/29/2016.
 */
public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
