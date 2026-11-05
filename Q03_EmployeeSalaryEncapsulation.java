class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int id) { employeeId = id; }
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String name) { employeeName = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary < 0 || salary > 1000000)
            System.out.println("Invalid salary. Salary must be between 0 and 1000000.");
        else this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Salary: Rs. " + getSalary());
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(201); e.setEmployeeName("Neha");
        e.setSalary(45000); e.setSalary(-5000); e.displayDetails();
    }
}
