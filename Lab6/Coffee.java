import java.util.ArrayList;
import java.util.Collections;
        public class Coffee {
                private float weight;
                private float price;

                private String quality;
                private double pwRatio;

                private ArrayList<Coffee> coffees;

                public float getWeight() {
                        return weight;
                }
                public void setWeight(float weight) {
                        this.weight = weight;
                }
                public float getPrice() {
                        return price;
                }
                public void setPrice(float price) {
                        this.price = price;
                }
                public void setQuality(String quality) {
                        this.quality = quality;
                }
                public Coffee(int w, int p, String q) {
                        setWeight(w);
                        setPrice(p);
                        setQuality(q);
                        setPriceWeightRatio(price / (weight * 0.1)); //Припустимо, вартість упаковки становить 10% від обсягу.
                }
                public double getPriceWeightRatio() {
                        return pwRatio;
                }
                public void setPriceWeightRatio(double priceWeightRatio){
                        this.pwRatio = priceWeightRatio;
                }
                public void addCoffee(Coffee coffee) {
                        coffees.add(coffee);
                }
                public void getMinCoffeePrice() {
                        Coffee coffee = Collections.min(coffees, (c1, c2) -> Double.compare(c1.getPriceWeightRatio(), c2.getPriceWeightRatio()));
                        System.out.println("Price: " + coffee.getPrice());
                        System.out.println("Price Weight Ratio: " + coffee.getPriceWeightRatio());
                }
                public static Coffee[] priceRange(Coffee[] m, int a, int b) {
                        int length = 0;
                        for (Coffee coffee : m) {
                                if (coffee.getPrice() >= a && coffee.getPrice() <= b) {
                                        length++;
                                }
                        }
                        Coffee[] m1 = new Coffee[length];
                        for (int i = 0; i < m.length; i++) {
                                if (m[i].getPrice() >= a && m[i].getPrice() <= b) {
                                        m1[i] = m[i];
                                }
                        }
                        if (length == 0) {
                                return null;
                        } else {
                                return m1;
                        }
                }
        }


