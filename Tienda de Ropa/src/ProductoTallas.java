public class ProductoTallas extends Producto {
    private String[] tallas;

    public ProductoTallas(String nombre, String tipo, int cantidad, String[] tallas) {
        super(nombre, tipo, cantidad);
        this.tallas = tallas;
    }

    public String[] getTallas() {
        return tallas;
    }

    @Override
    public void mostrarInventario() {
        super.mostrarInventario();
        System.out.print("Tallas disponibles: ");
        for (int i = 0; i < tallas.length; i++) {
            System.out.print(tallas[i]);
            if (i < tallas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
