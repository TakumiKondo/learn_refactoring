package replace_temp_var.price.before;

public class Price {
    private int _quatity;
    private int _itemPrice;

    Price(int quantity, int itemPrice){
        _quatity = quantity;
        _itemPrice = itemPrice;
    }

    double getPrice() {
        int basePrice = _quatity * _itemPrice;
        double discountFactor;
        if(basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }
}
