class Gerente extends Empleado {
    private double bono;

    // Funcion para calcular salario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
}