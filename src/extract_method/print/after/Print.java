package extract_method.print.after;

public class Print {
    private  String _name;
    private Orders _orders;

    public Print(String name, Orders orders) {
        _name = name;
        _orders = orders;
    }

    void printOwing() {
        // ① Do not have local valiable
        printBanner();

        // ② Use local valiable
        printDetail(outStanding());
    }

    // ① Do not have local valiable
    private void printBanner() {
        System.out.println("*********************************");
        System.out.println("********* Custmer Owes **********");
        System.out.println("*********************************");
    }

    // ② Use local valiable
    private void printDetail(double outStanding) {
        System.out.println("Name         : " + _name);
        System.out.println("Total amount : " + outStanding);
    }

    // ③ Reassignment local valiable
    private double outStanding() {
        double outStanding = 0.0;
        for(Order order : _orders.elements()) {
            outStanding += order.getAmount();
        }
        return outStanding;
    }
}
