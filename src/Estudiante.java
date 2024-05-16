public class Estudiante extends Persona {
    private int grado;


    public void establecerGrado(int grado) {
        this.grado = grado;
    }

    public int setGrado() {
        return grado;
    }

    @Override
    public String toString() {
        return "Estudiante: " + setNombre() + ", Edad: " + setEdad() +
                ", Fecha de Nacimiento: " + getFechaNacimiento() + ", Grado: " + grado;
    }
}