package extract_method.print.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orders {
    private List<Order> _orders = new ArrayList<Order>();

    public void add(Order order) {
        _orders.add(order);
    }

    public List<Order> elements() {
        return  Collections.unmodifiableList(_orders);
    }
}
