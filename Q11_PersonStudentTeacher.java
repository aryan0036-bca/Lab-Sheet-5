class Person {
    String name;
    Person(String n) { name = n; }
    void displayName() { System.out.println("Name: " + name); }
}
class Student extends Person {
    String course;
    Student(String n, String c) { super(n); course = c; }
    void study() { System.out.println(name + " is studying " + course + "."); }
}
class Teacher extends Person {
    String subject;
    Teacher(String n, String s) { super(n); subject = s; }
    void teach() { System.out.println(name + " teaches " + subject + "."); }
}
class Q11_PersonStudentTeacher {
    public static void main(String[] args) {
        Student s = new Student("Aman", "BCA"); Teacher t = new Teacher("Meena", "Java");
        s.displayName(); System.out.println("Course: " + s.course); s.study();
        t.displayName(); System.out.println("Subject: " + t.subject); t.teach();
    }
}
