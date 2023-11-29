public class Inventario {
    private ProductoTallas[] productos;
    private int cantidadProductos;

    public Inventario() {
        this.cantidadProductos = 0;
        this.productos = new ProductoTallas[10]; // Tamaño inicial del arreglo, puedes ajustarlo según sea necesario
    }

    // Metodo para agregar un nuevo producto con tallas al inventario
    public void agregarProductoConTallas(String nombre, int stock, char talla) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos++] = new ProductoTallas(nombre, nombre, talla, null);
        } else {
            // Metodo para ampliar
            productos[cantidadProductos++] = new ProductoTallas(nombre, nombre, talla, null);
        }
    }

    // Metodo para realizar una compra
    public void realizarCompra(int i, int cantidadComprada) {
        if (i >= 0 && i < cantidadProductos) {
            productos[i].comprar(cantidadComprada);
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }

    // Metodo para realizar una venta
    public void realizarVenta(int i, int cantidadVendida) {
        if (i >= 0 && i < cantidadProductos) {
            productos[i].vender(cantidadVendida);
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }

    // Metodo para mostrar el estado actual del inventario
    public void mostrarInventario() {
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Índice: " + i);
            productos[i].mostrarInventario();
        }
    }

    // Metodo para ampliar los arreglos ??

}
