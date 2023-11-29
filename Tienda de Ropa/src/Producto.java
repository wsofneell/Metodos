public class Producto {
    private String nombre;
    private String tipo;
    private int cantidad;

    public Producto(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    // Métodos getters y setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para realizar una compra
    public void comprar(int cantidadComprada) {
        if (cantidadComprada > 0) {
            cantidad += cantidadComprada;
            System.out.println("Compra realizada. Cantidad actual: " + cantidad);
        } else {
            System.out.println("No se puede realizar la compra. Cantidad inválida.");
        }
    }

    // Método para realizar una venta
    public void vender(int cantidadVendida) {
        if (cantidadVendida > 0 && cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;
            System.out.println("Venta realizada. Cantidad restante: " + cantidad);
        } else {
            System.out.println("No se puede realizar la venta. Cantidad insuficiente en inventario.");
        }
    }

    // Método para mostrar información del producto
    public void mostrarInventario() {
        System.out.println("Producto: " + nombre + ", Tipo: " + tipo + ", Cantidad: " + cantidad);
    }
}
