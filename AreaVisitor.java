public class AreaVisitor implements ShapeVisitor {
    public void visitCircle(Circle circle) {
        // calculate area of circle and store it in circle.area
    }

    public void visitRectangle(Rectangle rectangle) {
        // calculate area of rectangle and store it in rectangle.area
    }

    public void visitTriangle(Triangle triangle) {
        // calculate area of triangle and store it in triangle.area
    }
}

public class DrawingVisitor implements ShapeVisitor {
    public void visitCircle(Circle circle) {
        // draw circle on canvas
    }

    public void visitRectangle(Rectangle rectangle) {
        // draw rectangle on canvas
    }

    public void visitTriangle(Triangle triangle) {
        // draw triangle on canvas
    }
}