class Vendedor extends Empleado {
    private double comisionPorVenta;
    private double ventasTotales;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (comisionPorVenta * ventasTotales);
    }
}