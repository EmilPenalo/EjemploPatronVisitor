public interface FiguraVisitor {
    void visitCirculo(Circulo circulo);
    void visitRectangulo(Rectangulo rectangulo);
    void visitTriangulo(Triangulo triangulo);
}