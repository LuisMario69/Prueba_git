class Rectangulo extends FiguraGeometrica {

    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, String color) {
        super(nombre, color);
    }

    //Forma para calcular el area

    public double calcularArea() {
        return longitud * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}
