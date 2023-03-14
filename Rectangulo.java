public class Rectangle implements Shape {
    private double width;
    private double height;
    private double area;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
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
        visitor.visitRectangle(this);
    }
}