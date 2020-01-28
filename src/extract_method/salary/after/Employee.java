package extract_method.salary.after;

public class Employee {
    private String _name;
    private int _salary;

    public Employee(String name, int salary) {
        _name = name;
        _salary = salary;
    }

    public String name() {
        return _name;
    }

    public int salary() {
        return _salary;
    }


}
