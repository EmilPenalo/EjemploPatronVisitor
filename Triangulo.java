public class Triangle implements Shape {
    private double base;
    private double height;
    private double area;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void accept(ShapeVisitor visitor) {
        visitor.visitTriangle(this);
    }
}