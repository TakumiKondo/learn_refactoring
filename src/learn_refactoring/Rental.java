package learn_refactoring;

public class Rental {

    private Movie _movie;
    private int _daysRened;

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysrented() {
        return _daysRened;
    }

    public double getCharge() {

        double amount = 0;

        switch(_movie.getPriceCode()) {
            case Movie.REGULAR:
                amount = +2;
                if(getDaysrented() > 2) {
                    amount += (getDaysrented() - 2) * 1.5;
                }
                break;

            case Movie.NEW_RELEASE:
                amount += getDaysrented() * 3;
                break;

            case Movie.CHILDRENS:
                amount += 1.5;
                if(getDaysrented() > 3) {
                    amount += (getDaysrented() -3) * 1.5;
                }
                break;
        }

        return amount;
    }


    public int getFrequntRenterPoints() {
        if((_movie.getPriceCode() == Movie.NEW_RELEASE) && getDaysrented() > 1) {
            return 2;
        }

        return 1;
    }
}
