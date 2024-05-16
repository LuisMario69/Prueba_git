class Rectangulo extends FiguraGeometrica {

    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, String color) {
        super(nombre, color);
    }

    public double calcularArea() {
        return longitud * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}
