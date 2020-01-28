package extract_method.print.before;

public class Print {
    private  String _name;
    private Orders _orders;

    public Print(String name, Orders orders) {
        _name = name;
        _orders = orders;
    }

    void printOwing() {
        // print banner … ① Do not have local valiable
        System.out.println("*********************************");
        System.out.println("********* Custmer Owes **********");
        System.out.println("*********************************");

        // unpaid amounts … ③ Reassignment local valiable
        double outStanding = 0.0;
        for(Order order : _orders.elements()) {
            outStanding += order.getAmount();
        }

        // Print details … ② Use local valiable
        System.out.println("Name         : " + _name);
        System.out.println("Total amount : " + outStanding);

    }
}
