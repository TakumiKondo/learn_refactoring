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
            Rental each = rentals.nextElement();
            frequentRenterPoints++;

            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                each.getDaysrented() > 1) {
                    frequentRenterPoints++;
            }

            result += "\t" + each.getMovie().getTitle() + "\t" +
                      String.valueOf(each.getCharge()) + " \n";

            totalAmount += each.getCharge();
        }

        result += "Amlount owed is " + String.valueOf(totalAmount);
        result += "You earned " + String.valueOf(frequentRenterPoints) + "frequent renter pints";

        return result;
    }

}
