package explanatory_var.price.after;

public class Main {
    public static void main(String...args) {
        Price price1 = new Price(500, 1000);
        Price price2 = new Price(501, 1000);

        System.out.println("Price1 : " + price1.price());
        System.out.println("Price2 : " + price2.price());
    }
}
