package learn_refactoring;

public class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRentened) {
        double amount = +2;
        if(daysRentened > 2)
            amount += (daysRentened - 2) * 1.5;

        return amount;
    }

}
