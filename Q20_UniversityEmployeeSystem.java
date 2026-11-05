abstract class Employee {
    private int employeeId; private String employeeName; private double salary;
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int id) { employeeId = id; }
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String name) { employeeName = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { if (salary >= 0) this.salary = salary; else System.out.println("Invalid salary."); }
    void displayDetails() { System.out.println("ID: " + getEmployeeId() + ", Name: " + getEmployeeName()); }
    double calculateSalary() { return getSalary(); }
}
interface Researcher { void conductResearch(); }
class Teacher extends Employee implements Researcher {
    private String subject;
    Teacher(int id, String name, double salary, String subject) {
        setEmployeeId(id); setEmployeeName(name); setSalary(salary); this.subject = subject;
    }
    void teach() { System.out.println(getEmployeeName() + " teaches " + subject + "."); }
    public void conductResearch() { System.out.println(getEmployeeName() + " conducts academic research."); }
    @Override double calculateSalary() { return super.calculateSalary() + 5000; }
}
class VisitingTeacher extends Teacher {
    private int hoursWorked;
    VisitingTeacher(int id, String name, double rate, String subject, int hours) {
        super(id, name, rate, subject); hoursWorked = hours;
    }
    @Override double calculateSalary() { return getSalary() * hoursWorked; }
}
class Admin extends Employee {
    private String department;
    Admin(int id, String name, double salary, String department) {
        setEmployeeId(id); setEmployeeName(name); setSalary(salary); this.department = department;
    }
    void manageDepartment() { System.out.println(getEmployeeName() + " manages " + department + " department."); }
}
class Q20_UniversityEmployeeSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(701, "Dr. Mehta", 50000, "Computer Science");
        VisitingTeacher visiting = new VisitingTeacher(702, "Ms. Roy", 1000, "Mathematics", 20);
        Admin admin = new Admin(703, "Mr. Khan", 40000, "Accounts");
        teacher.displayDetails(); teacher.teach(); teacher.conductResearch();
        System.out.println("Teacher Salary: Rs. " + teacher.calculateSalary());
        visiting.displayDetails(); System.out.println("Visiting Teacher Salary: Rs. " + visiting.calculateSalary());
        admin.displayDetails(); admin.manageDepartment();
    }
}
