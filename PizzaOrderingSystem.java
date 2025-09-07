class Pizza {
    void bake() {
        System.out.println("Baking a delicious pizza!");
    }
}

class VegPizza extends Pizza {
    void addToppings() {
        System.out.println("Adding fresh vegetables!");
    }
}

class CheesePizza extends Pizza {
    void addExtraCheese() {
        System.out.println("Adding extra cheese!");
    }
}

public class PizzaOrderingSystem {
    public static void main(String[] args) {
        VegPizza veg = new VegPizza();
        veg.bake();
        veg.addToppings();

        CheesePizza cheese = new CheesePizza();
        cheese.bake();
        cheese.addExtraCheese();
    }
}
