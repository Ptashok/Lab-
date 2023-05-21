import java.util.ArrayList;
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

        public void setPriceWeightRatio(double priceWeightRatio) {
                this.pwRatio = priceWeightRatio;
        }
}


