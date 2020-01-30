package method_object.price.after;

// STEP1: Create new class.
public class Charge {

    // STEP2: Difine fileds.
    private final Price _price;
    private int baseprice;
    private double discountRate;
    private int shipping;
    private double discountPrice;
    private double price;

    // STEP3: Difine constructor.
    Charge(Price source, int basepriceArg, double discountRateArg, int shippingArg){
        _price = source;
        baseprice = basepriceArg;
        discountRate = discountRateArg;
        shipping = shippingArg;
    }

    // STEP4: Copy method from source class.
    double compute() {
        discountPrice = baseprice * discountRate;

        // STEP4-1: Make source class fields accessible.
//        if (_price.isLateShipping()) {
//            shipping = 0;
//        }

        // STEP7: Replace with method.
        price = discountPrice + shipping();

        return price;
    }

    // STEP6: Extract method.
    int shipping() {
        if (_price.isLateShipping()) {
            shipping = 0;
        }
        return shipping;
    }

}
