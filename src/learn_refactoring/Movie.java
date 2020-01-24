package learn_refactoring;

public class Movie {

    public static final int CHILDRENS = 1;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 2;

    private String _title;
//    private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        switch(priceCode) {
            case REGULAR:
                _price = new RegularPrice();
                break;

            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;

            case CHILDRENS:
                _price = new ChildrensPrice();;
                break;

            default:
                throw new IllegalArgumentException("不正な料金コード");
        }
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public double getCharge(int daysRentened) {
        return _price.getCharge(daysRentened);
    }

    public int getFrequntRenterPoints(int daysrented) {
        if((getPriceCode() == NEW_RELEASE) && daysrented > 1) {
            return 2;
        }

        return 1;
    }
}
