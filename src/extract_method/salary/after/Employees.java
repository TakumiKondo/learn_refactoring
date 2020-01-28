package extract_method.salary.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employees {
    private List<Employee> _employees = new ArrayList<Employee>();

    public void add(Employee employee) {
        _employees.add(employee);
    }

    public List<Employee> elements() {
        return  Collections.unmodifiableList(_employees);
    }
}
