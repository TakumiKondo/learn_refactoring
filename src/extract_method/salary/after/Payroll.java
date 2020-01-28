package extract_method.salary.after;

public class Payroll {
    private Employees _employees;

    public Payroll(Employees employees) {
        _employees = employees;
    }

    void printPayroll() {
        // Print Header … ① Do not have local valiable
        printHeader();

        // Print details … ③ Reassignment local valiable
        printDetails();

        // Print Total Salary … ② Use local valiable
        printTotalSalary(totalSalary());
    }

    // ① Do not have local valiable
    private void printHeader() {
        System.out.println("*********************************");
        System.out.println("*********   Payroll    **********");
        System.out.println("*********************************");
    }

    // ② Use local valiable
    private void printTotalSalary(int totalSalary) {
        System.out.println("-----------------------------------");
        System.out.println("Total Salary : " + totalSalary);
    }

    // ③-1 Reassignment local valiable
    private void printDetails(){
        for(Employee employee : _employees.elements()) {
            System.out.println("Name   : " + employee.name());
            System.out.println("Salary : " + employee.salary());
        }
    }

    // ③-2 Reassignment local valiable
    private int totalSalary(){
        int totalSalary = 0;
        for(Employee employee : _employees.elements()) {
            totalSalary += employee.salary();
        }
        return totalSalary;
    }
}
