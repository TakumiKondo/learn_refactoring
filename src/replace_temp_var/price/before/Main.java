package replace_temp_var.price.before;

public class Main {
    public static void main(String...args) {
        Price price1 = new Price(1, 1000);
        Price price2 = new Price(1, 2000);

        System.out.println("Price1 : " + price1.getPrice());
        System.out.println("Price2 : " + price2.getPrice());
    }
}
