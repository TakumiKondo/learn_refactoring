package learn_refactoring;

public class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRentened) {
        return daysRentened * 3;
    }

    @Override
    public int getFrequntRenterPoints(int daysrented) {
        return (daysrented > 1) ? 2 : 1;
    }

}
