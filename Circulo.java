public class Circulo implements Figura {
    private double radio;
    private double area;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void accept(FiguraVisitor visitor) {
        visitor.visitCirculo(this);
    }
}