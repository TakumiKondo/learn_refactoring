package extract_method.salary.before;

public class Payroll {
    private Employees _employees;

    public Payroll(Employees employees) {
        _employees = employees;
    }

    void printPayroll() {
        // Print Header … ① Do not have local valiable
        System.out.println("*********************************");
        System.out.println("*********   Payroll    **********");
        System.out.println("*********************************");

        // Print details … ③ Reassignment local valiable
        int totalSalary = 0;
        for(Employee employee : _employees.elements()) {
            System.out.println("Name   : " + employee.name());
            System.out.println("Salary : " + employee.salary());
            totalSalary += employee.salary();
        }

        // Print Total Salary … ② Use local valiable
        System.out.println("-----------------------------------");
        System.out.println("Total Salary : " + totalSalary);
    }
}
