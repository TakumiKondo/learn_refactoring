package learn_refactoring;

public class ChildrensPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRentened) {
        double amount = 1.5;
        if(daysRentened > 3)
            amount += (daysRentened -3) * 1.5;

        return amount;
    }

}
