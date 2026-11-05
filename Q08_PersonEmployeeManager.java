class Person {
    String name;
    Person(String name) { this.name = name; }
    void displayName() { System.out.println("Name: " + name); }
}
class Employee extends Person {
    int employeeId;
    Employee(String n, int id) { super(n); employeeId = id; }
    void displayEmployee() { displayName(); System.out.println("Employee ID: " + employeeId); }
}
class Manager extends Employee {
    String department;
    Manager(String n, int id, String d) { super(n, id); department = d; }
    void displayManager() { displayEmployee(); System.out.println("Department: " + department); }
}
class Q08_PersonEmployeeManager {
    public static void main(String[] args) { Manager m = new Manager("Priya", 301, "Sales"); m.displayManager(); }
}
