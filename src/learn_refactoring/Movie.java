package learn_refactoring;

public class Movie {

    public static final int CHILDRENS = 1;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 2;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int priceCode) {
        _priceCode = priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int daysRentened) {
        double amount = 0;

        switch(getPriceCode()) {
            case REGULAR:
                amount = +2;
                if(daysRentened > 2)  amount += (daysRentened - 2) * 1.5;
                break;

            case NEW_RELEASE:
                amount += daysRentened * 3;
                break;

            case CHILDRENS:
                amount += 1.5;
                if(daysRentened > 3)  amount += (daysRentened -3) * 1.5;
                break;
        }

        return amount;
    }
}
