import java.util.HashMap;
import java.util.Map;

public class Maquina {
    // Atributos
    private double dineroRecibido;
    private Map<String, Producto> inventario;

    // Constructor
    public Maquina() {
        this.dineroRecibido = 0.0;
        this.inventario = new HashMap<>();
    }

    // Métodos
    public void cargarProducto(Producto producto) {
        inventario.put(producto.getCodigo(), producto);
    }

    public void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for (Producto p : inventario.values()) {
            System.out.println(p);
        }
    }

    public void seleccionarProducto(String codigo) {
        Producto producto = inventario.get(codigo);
        if (producto != null && producto.getCantidad() > 0) {
            if (dineroRecibido >= producto.getPrecio()) {
                producto.dispensa();
                dineroRecibido -= producto.getPrecio();
                System.out.println("Has comprado: " + producto.getNombre());
            } else {
                System.out.println("Dinero insuficiente. Inserta más dinero.");
            }
        } else {
            System.out.println("Producto no disponible.");
        }
    }

    public void recibirDinero(double cantidad) {
        dineroRecibido += cantidad;
        System.out.println("Dinero recibido: $" + cantidad);
    }
}
