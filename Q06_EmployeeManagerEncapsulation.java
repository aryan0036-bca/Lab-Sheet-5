class Employee {
    private String name; private double salary;
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setSalary(double salary) { if (salary >= 0) this.salary = salary; else System.out.println("Invalid salary."); }
    public double getSalary() { return salary; }
}
class Manager extends Employee {
    private String department;
    public void setDepartment(String d) { department = d; }
    public void displayManager() {
        System.out.println("Name: " + getName()); System.out.println("Salary: Rs. " + getSalary());
        System.out.println("Department: " + department);
    }
}
class Q06_EmployeeManagerEncapsulation {
    public static void main(String[] args) {
        Manager m = new Manager(); m.setName("Karan"); m.setSalary(65000); m.setDepartment("IT"); m.displayManager();
    }
}
