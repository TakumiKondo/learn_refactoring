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
