import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Persona {
    private String nombre;
    private int edad;
    private String fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void calcularFechaNacimiento() {
        if (this.edad > 0) {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaNacimientoCalculada = fechaActual.minusYears(this.edad);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            this.fechaNacimiento = fechaNacimientoCalculada.format(formatter);
        }
    }


