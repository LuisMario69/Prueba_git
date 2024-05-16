class Empleado {
    private String nombre;
    private double salarioBase;

    public double calcularSalario() {
        return salarioBase;
    }
}

// Clase vendedor

class Vendedor extends Empleado {
    private double comisionPorVenta;
    private double ventasTotales;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (comisionPorVenta * ventasTotales);
    }
}