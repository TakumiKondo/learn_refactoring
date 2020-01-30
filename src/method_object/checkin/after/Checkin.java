package method_object.checkin.after;

public class Checkin {
    private int _stayDays;

    Checkin(int staydays){
        _stayDays = staydays;
    }

    double charge(double discountPrice, int mealPrice, boolean isVip) {
        // STEP5: Replace wiht Method Object.
        return new Charge(this, discountPrice, mealPrice, isVip).compute();
    }

    // STEP4-1: stayDays accessible
    int stayDays() {
        return _stayDays;
    }

}
