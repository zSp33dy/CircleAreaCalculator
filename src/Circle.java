
public class Circle {

    private double radius;
    private double area;
    final private double pi = 3.14159;

    public Circle() {
        // default constructor
    }

    public Circle(double radius) {
        this();
        setRadius(radius);
    }

    private void checkRadius() {
        // TODO:  Throw an exception.
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        radius = this.radius;
        area = pi * radius * radius;
        return area;
    }

}
