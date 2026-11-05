class Employee {
    String employeeName; int employeeId;
    Employee(String n, int id) { employeeName = n; employeeId = id; }
    void displayEmployee() { System.out.println("Name: " + employeeName + ", ID: " + employeeId); }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(String n, int id, String lang) { super(n, id); programmingLanguage = lang; }
    void writeCode() { System.out.println(employeeName + " writes code in " + programmingLanguage + "."); }
}
class Manager extends Employee {
    String department;
    Manager(String n, int id, String d) { super(n, id); department = d; }
    void conductMeeting() { System.out.println(employeeName + " conducts a meeting for " + department + "."); }
}
class Q12_EmployeeDeveloperManager {
    public static void main(String[] args) {
        Developer d = new Developer("Ravi", 401, "Java"); Manager m = new Manager("Sana", 402, "Development");
        d.displayEmployee(); System.out.println("Language: " + d.programmingLanguage); d.writeCode();
        m.displayEmployee(); System.out.println("Department: " + m.department); m.conductMeeting();
    }
}
