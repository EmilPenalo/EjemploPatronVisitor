public class Circle implements Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void accept(ShapeVisitor visitor) {
        visitor.visitCircle(this);
    }
}