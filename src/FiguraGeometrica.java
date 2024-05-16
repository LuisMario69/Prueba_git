class FiguraGeometrica {
    private String nombre;
    private String color;

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public String obtenerColor() {
        return color;
    }
}

class Rectangulo extends FiguraGeometrica {
    private double longitud;
    private double ancho;

    public void establecerLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double obtenerLongitud() {
        return longitud;
    }

    public void establecerAncho(double ancho) {
        this.ancho = ancho;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}