package replace_temp_var.price.after;

public class Price {
    private int _quatity;
    private int _itemPrice;

    Price(int quantity, int itemPrice){
        _quatity = quantity;
        _itemPrice = itemPrice;
    }

    double getPrice() {
        return basePrice() * discountFactor();
    }

    private int basePrice() {
        return _quatity * _itemPrice;
    }

    private double discountFactor() {
        if(basePrice() > 1000) return 0.95;
        else return 0.98;
    }

}
