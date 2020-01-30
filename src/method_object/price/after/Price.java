package method_object.price.after;

public class Price {
    private boolean _lateShipping;

    Price(){
        _lateShipping = false;
    }

    double charge(int baseprice, double discountRate, int shipping) {
        // STEP5: Replace to Method Object.
        return new Charge(this, baseprice, discountRate, shipping).compute();

//        double discountPrice = baseprice * discountRate;
//        if (_lateShipping) {
//            shipping = 0;
//        }
//        double price = discountPrice + shipping;
//
//        return price;
    }

    void lateShippingOn() {
        _lateShipping = true;
    }

    // STEP4-1: Make source class fields accessible.
    boolean isLateShipping() {
        return _lateShipping;
    }
}
