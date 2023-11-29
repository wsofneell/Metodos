public class App {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar productos al inventario
        char[] tallasCamisas = { 'x', 's', 'm', 'l', 'g' };
        int[] tallasPantalones = { 5, 6, 7, 8, 9 };
        char[] tallasVestidos = { 'x', 's', 'm', 'l', 'g' };

        // Agregar camisas al inventario
        for (char talla : tallasCamisas) {
            inventario.agregarProductoConTallas("Camisa", 10, talla);
        }

        // Agregar pantalones al inventario
        for (int talla : tallasPantalones) {
            inventario.agregarProductoConTallas("Pantalón", 8, (char) talla);
        }

        // Agregar vestidos al inventario
        for (char talla : tallasVestidos) {
            inventario.agregarProductoConTallas("Vestido", 15, talla);
        }

        // Mostrar el estado actual del inventario
        System.out.println("Inventario Inicial:");
        inventario.mostrarInventario();

        // Realizar compra y venta de productos
        inventario.realizarCompra(0, 2);
        inventario.realizarVenta(1, 5);

        // Mostrar el estado actual del inventario después de las operaciones
        System.out.println("\nInventario Después de Operaciones:");
        inventario.mostrarInventario();
    }
}
