class Gerente extends Empleado {
    private double bono;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
}