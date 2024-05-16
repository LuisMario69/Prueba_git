public class Estudiante extends Persona {
    private int grado;





    public void establecerGrado(int grado) {
        this.grado = grado;
    }

    public int obtenerGrado() {
        return grado;
    }

    @Override
    public String toString() {
        return "Estudiante: " + obtenerNombre() + ", Edad: " + obtenerEdad() + ", Fecha de Nacimiento: " + obtenerFechaNacimiento() + ", Grado: " + grado;
    }
}