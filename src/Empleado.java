class Empleado {
    private String nombre;
    private double salarioBase;

    public double calcularSalario() {
        return salarioBase;
    }
}
 // Clase gerente

class Gerente extends Empleado {
    private double bono;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
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