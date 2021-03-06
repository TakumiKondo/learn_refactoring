package learn_refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statment() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while(rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = rentals.nextElement();

            switch(each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount = +2;
                    if(each.getDaysrented() > 2) {
                        thisAmount += (each.getDaysrented() - 2) * 1.5;
                    }
                    break;

                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysrented() * 3;
                    break;

                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if(each.getDaysrented() > 3) {
                        thisAmount += (each.getDaysrented() -3) * 1.5;
                    }
                    break;
            }

            frequentRenterPoints++;

            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                each.getDaysrented() > 1) {
                    frequentRenterPoints++;
            }

            result += "\t" + each.getMovie().getTitle() + "\t" +
                      String.valueOf(thisAmount) + " \n";

            totalAmount += thisAmount;
        }

        result += "Amlount owed is " + String.valueOf(totalAmount);
        result += "You earned " + String.valueOf(frequentRenterPoints) + "frequent renter pints";

        return result;
    }
}
