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
        return _movie.getCharge(_daysRened);
    }


    public int getFrequntRenterPoints() {
        if((_movie.getPriceCode() == Movie.NEW_RELEASE) && getDaysrented() > 1) {
            return 2;
        }

        return 1;
    }

}
