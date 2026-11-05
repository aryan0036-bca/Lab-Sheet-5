class Employee {
    double basicSalary;
    Employee(double salary) { basicSalary = salary; }
    double calculateSalary() { return basicSalary; }
}
class Manager extends Employee {
    double allowance;
    Manager(double salary, double allowance) { super(salary); this.allowance = allowance; }
    @Override double calculateSalary() { return basicSalary + allowance; }
}
class Q14_EmployeeSalaryOverriding {
    public static void main(String[] args) {
        Employee e = new Employee(40000); Employee m = new Manager(50000, 15000);
        System.out.println("Employee Salary: Rs. " + e.calculateSalary());
        System.out.println("Manager Salary: Rs. " + m.calculateSalary());
    }
}
