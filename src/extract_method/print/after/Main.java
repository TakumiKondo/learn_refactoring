package extract_method.print.after;

public class Main {

    public static void main(String...args) {
        Orders orders = new Orders();
        orders.add( new Order(100));
        orders.add( new Order(50.5));
        orders.add( new Order(1.001));

        Print print = new Print("hoge", orders);
        print.printOwing();
    }
}
