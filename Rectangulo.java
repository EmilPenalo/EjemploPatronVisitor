public class Rectangulo implements Figura {
    private double largo;
    private double altura;
    private double area;

    public Rectangulo(double largo, double altura) {
        this.largo = largo;
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void accept(FiguraVisitor visitor) {
        visitor.visitRectangulo(this);
    }
}