class Shape { double calculateArea() { return 0; } }
class Circle extends Shape {
    double radius; Circle(double r) { radius = r; }
    @Override double calculateArea() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double l, double b) { length = l; breadth = b; }
    @Override double calculateArea() { return length * breadth; }
}
class Q15_ShapeAreaOverriding {
    public static void main(String[] args) {
        Shape c = new Circle(5); Shape r = new Rectangle(10, 4);
        System.out.printf("Circle Area: %.2f%n", c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
