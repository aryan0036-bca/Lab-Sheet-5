class Employee {
    private String name; private int employeeId;
    Employee(String n, int id) { name = n; employeeId = id; }
    public String getName() { return name; }
    public int getEmployeeId() { return employeeId; }
    void displayEmployee() { System.out.println("Name: " + getName()); System.out.println("Employee ID: " + getEmployeeId()); }
}
interface Programmer { void writeCode(); }
interface Researcher { void conductResearch(); }
class Developer extends Employee implements Programmer, Researcher {
    Developer(String n, int id) { super(n, id); }
    public void writeCode() { System.out.println(getName() + " is writing code."); }
    public void conductResearch() { System.out.println(getName() + " is conducting research."); }
}
class Q19_DeveloperProgrammerResearcher {
    public static void main(String[] args) { Developer d = new Developer("Arjun", 601); d.displayEmployee(); d.writeCode(); d.conductResearch(); }
}
