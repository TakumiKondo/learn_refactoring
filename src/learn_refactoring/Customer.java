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

        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while(rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();

            result += "\t" + each.getMovie().getTitle() + "\t" +
                      String.valueOf(each.getCharge()) + " \n";
        }

        result += "Amlount owed is " + String.valueOf(getTotalAmount());
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + "frequent renter pints";

        return result;
    }

    private double getTotalAmount() {
        double amount = 0;
        Enumeration<Rental> rentals = _rentals.elements();

        while(rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            amount += each.getCharge();
        }

        return amount;
    }

    private int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();

        while(rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            frequentRenterPoints += each.getFrequntRenterPoints();
        }

        return frequentRenterPoints;
    }
}
