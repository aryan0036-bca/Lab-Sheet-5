class Person {
    String name; int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    void displayPerson() { System.out.println("Name: " + name); System.out.println("Age: " + age); }
}
class Student extends Person {
    int rollNo; String course;
    Student(String n, int a, int r, String c) { super(n, a); rollNo = r; course = c; }
    void displayStudent() { displayPerson(); System.out.println("Roll No: " + rollNo); System.out.println("Course: " + course); }
}
class Q05_PersonStudent {
    public static void main(String[] args) { Student s = new Student("Aman", 20, 101, "BCA"); s.displayStudent(); }
}
