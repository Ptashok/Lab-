import java.util.ArrayList;
import java.util.Collections;
public class Shop {
    private final ArrayList<Coffee> coffees;
    private String name;
    public Shop(String name) {
        setName(name);
        coffees = new ArrayList<>();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addCoffee(Coffee coffee) {
        coffees.add(coffee);
    }
    public void getMinCoffeePrice() {
        Coffee coffee = Collections.min(coffees, (c1, c2) -> Double.compare(c1.getPriceWeightRatio(), c2.getPriceWeightRatio()));
        System.out.println("Price: " + coffee.getPrice());
        System.out.println("Price Weight Ratio: " + coffee.getPriceWeightRatio());
    }
}

