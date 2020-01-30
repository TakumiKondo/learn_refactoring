package method_object.price.before;

public class Main {

    public static void main(String...args) {
        Price price = new Price();
        System.out.println(price.charge(100, 0.9, 500));

        price.lateShippingOn();
        System.out.println(price.charge(100, 0.9, 500));
    }
}
