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
        return _movie.getFrequntRenterPoints(getDaysrented());
    }

}
