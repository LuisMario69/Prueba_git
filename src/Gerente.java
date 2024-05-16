class Gerente extends Empleado {
    private double bono;

    // Polimorfismo
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
}
