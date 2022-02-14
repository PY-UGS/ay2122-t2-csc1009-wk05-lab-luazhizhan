abstract class Shape {
    protected double dim1;
    protected double dim2;
    protected final double PI = 3.14;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();

    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);
        Shape figref;

        figref = r;
        System.out.println("Inside Area for Rectangle.");
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Inside Area for Triangle.");
        System.out.println("Area is " + figref.area());

        figref = c;
        System.out.println("Inside Area for Circle.");
        System.out.println("Area is " + figref.area());

        figref = e;
        System.out.println("Inside Area for Ellipse.");
        System.out.println("Area is " + figref.area());

        figref = s;
        System.out.println("Inside Area for Square.");
        System.out.println("Area is " + figref.area());
    }
}

class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Circle extends Shape {

    public Circle(double radius1, double radius2) {
        super(radius1, radius2);
    }

    @Override
    double area() {
        return PI * dim1 * dim2;
    }
}

class Ellipse extends Shape {

    public Ellipse(double axisA, double axisB) {
        super(axisA, axisB);
    }

    @Override
    double area() {
        return PI * dim1 * dim2;
    }
}

class Square extends Shape {

    public Square(double length1, double length2) {
        super(length1, length2);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}
