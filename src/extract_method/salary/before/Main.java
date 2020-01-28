package extract_method.salary.before;

public class Main {

    public static void main(String...args) {
        Employees employees = new Employees();
        employees.add(new Employee("山田 太郎", 300000));
        employees.add(new Employee("木下 次元", 500000));
        employees.add(new Employee("横山 三郎", 450000));
        employees.add(new Employee("斎藤 太郎", 180000));
        employees.add(new Employee("勅使河原 太郎", 1300000));
        employees.add(new Employee("猪瀬 太郎", 3000000));

        Payroll payroll = new Payroll(employees);
        payroll.printPayroll();
    }
}
