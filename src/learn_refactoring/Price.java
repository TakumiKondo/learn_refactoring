package learn_refactoring;

abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRentened);

    public int getFrequntRenterPoints(int daysrented) {
        return 1;
    }
}
