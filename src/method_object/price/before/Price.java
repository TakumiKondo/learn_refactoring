package method_object.price.before;

public class Price {
    private boolean _lateShipping;

    Price(){
        _lateShipping = false;
    }

    double charge(int baseprice, double discountRate, int shipping) {
        double discountPrice = baseprice * discountRate;
        if (_lateShipping) {
            shipping = 0;
        }
        double price = discountPrice + shipping;

        return price;
    }

    void lateShippingOn() {
        _lateShipping = true;
    }
}
