public class Main {
    public static void main(String[] args) {
        Soluble h = new Soluble(250, 450, "Bad-quality");
        Grain a = new Grain(1000, 500, "Above-average");
        Milled s = new Milled(500, 200, "High");
        Coffee[] coffee = {h, a, s};
        System.out.println("Кава відсортована за співвідношенням ціна/вага:");
        for (Coffee item : coffee) {
            System.out.print(item.getPriceWeightRatio() + " ");
        }
        Shop shop = new Shop("Mr Ivan");
        for (Coffee c : coffee){
            shop.addCoffee(c);
        }
        shop.getMinCoffeePrice();
    }
}



