public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5.0);
        Rectangulo r = new Rectangulo(10.0, 20.0);
        Triangulo t = new Triangulo(15.0, 7.0);

        AreaVisitor areaVisitor = new AreaVisitor();
        DibujarVisitor dibujarVisitor = new DibujarVisitor();

        c.accept(areaVisitor);
        r.accept(areaVisitor);
        t.accept(areaVisitor);

        System.out.println("Area del circulo: " + c.getArea());
        System.out.println("Area del rectangulo: " + r.getArea());
        System.out.println("Area del triangulo: " + t.getArea());

        c.accept(dibujarVisitor);
        r.accept(dibujarVisitor);
        t.accept(dibujarVisitor);
    }
}