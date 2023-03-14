public class AreaVisitor implements FiguraVisitor {
    public void visitCirculo(Circulo circulo) {
        double area = Math.PI * circulo.getRadio() * circulo.getRadio();
        circulo.setArea(area);
    }

    public void visitRectangulo(Rectangulo rectangulo) {
        double area = rectangulo.getLargo() * rectangulo.getAltura();
        rectangulo.setArea(area);
    }

    public void visitTriangulo(Triangulo triangulo) {
        double area = 0.5 * triangulo.getBase() * triangulo.getAltura();
        triangulo.setArea(area);
    }
}