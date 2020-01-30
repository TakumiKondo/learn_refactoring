package method_object.checkin.after;

// STEP1: Create new class(Charge).
public class Charge {

    // STEP2: Define fields(source class, args, local variables)
    private final Checkin _checkin;
    private double _discountPrice;
    private int _mealPrice;
    private boolean _isVip;
    private double _totalPrice;
    private int _stayPrice;

    // STEP3: Define constructor
    Charge(Checkin checkin, double discountPrice, int mealPrice, boolean isVip){
        _checkin = checkin;
        _discountPrice = discountPrice;
        _mealPrice = mealPrice;
        _isVip = isVip;
    }

    // STEP4: Copy method(charge) from source class.
    double compute() {
//        _totalPrice = 0;
//        _stayPrice = _checkin.stayDays() * 5000;	// STEP4-1: stayDays accessible
//        _totalPrice = stayPrice() + _mealPrice;
//        _totalPrice = _totalPrice - _discountPrice;
//        if (_isVip) {
//            _totalPrice = _totalPrice * 0.9;
//        }

        // STEP7: Replace with extracted method.
        return totalPrice();
    }

    // STEP6: Extract method(stayPrice).
    int stayPrice() {
        return _checkin.stayDays() * 5000;
    }

    // STEP6-1: Extract method(totalPrice)
    double totalPrice() {
        _totalPrice = stayPrice() + _mealPrice - _discountPrice;
        if (_isVip) {
            _totalPrice = _totalPrice * 0.9;
        }
        return _totalPrice;
    }

}
