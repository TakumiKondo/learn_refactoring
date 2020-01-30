package method_object.checkin.before;

public class Checkin {
    private int _stayDays;

    Checkin(int staydays){
        _stayDays = staydays;
    }

    double charge(double discountPrice, int mealPrice, boolean isVip) {
        double totalPrice = 0;
        int stayPrice = _stayDays * 5000;
        totalPrice = stayPrice + mealPrice;
        totalPrice = totalPrice - discountPrice;
        if (isVip) {
            totalPrice = totalPrice * 0.9;
        }

        return totalPrice;
    }

}
