package Encapsulacion;

public class Producto {
	
	private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        precio -= precio * (porcentaje / 100);
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre + " | Código: " + codigo + " | Precio: Q" + precio);
    }
    
}