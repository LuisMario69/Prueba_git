public class Main {
    public static void main(String[] args) {
        // Pruebas de encapsulamiento
        Persona persona1 = new Persona("Juan Pérez", 30, "1992-05-15");
        System.out.println("Nombre: " + persona1.obtenerNombre());
        System.out.println("Edad: " + persona1.obtenerEdad());
        System.out.println("Fecha de Nacimiento: " + persona1.obtenerFechaNacimiento());
        persona1.calcularFechaNacimiento();
        System.out.println("Fecha de Nacimiento Calculada: " + persona1.obtenerFechaNacimiento());

        // Pruebas de herencia
        Estudiante estudiante1 = new Estudiante("María Gómez", 20, "2002-09-22", 3);
        System.out.println(estudiante1.toString());

        // Pruebas de polimorfismo
        Trabajador trabajador1 = new Estudiante("Pedro Ramírez", 18, "2005-03-10", 1);
        Trabajador trabajador2 = new Empleado();
        Trabajador trabajadorAnonimo = new Trabajador() {
            @Override
            public void realizarTarea() {
                System.out.println("Realizando tarea de clase anónima");
            }
        };

        trabajador1.realizarTarea();
        trabajador2.realizarTarea();
        trabajadorAnonimo.realizarTarea();

        // Pruebas de encapsulamiento y herencia
        FiguraGeometrica figura1 = new Rectangulo();
        figura1.establecerNombre("Rectángulo Azul");
        figura1.establecerColor("Azul");
        Rectangulo rectangulo1 = (Rectangulo) figura1;
        rectangulo1.establecerLongitud(5);
        rectangulo1.establecerAncho(3);
        System.out.println("Nombre: " + figura1.obtenerNombre());
        System.out.println("Color: " + figura1.obtenerColor());
        System.out.println("Área: " + rectangulo1.calcularArea());
        System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());

        // Pruebas de herencia y polimorfismo
        Empleado empleado1 = new Gerente();
        Empleado empleado2 = new Vendedor();
        System.out.println("Salario del Gerente: " + empleado1.calcularSalario());
        System.out.println("Salario del Vendedor: " + empleado2.calcularSalario());
    }
}