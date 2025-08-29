import java.util.Map;
import java.util.HashMap;

public class Maquina {

    private double dineroRecibido;
    private Map<String, Producto> inventario;

    public Maquina() {
        this.dineroRecibido = 0.0;
        this.inventario = new HashMap<>();
    }

    public void cargarProducto(Producto producto) {
        // En un escenario real, necesitarías una clave para el Map,
        // pero siguiendo el diagrama, solo se carga el objeto.
        // Asumiendo que 'Producto' tiene un identificador único (ej: nombre).
        // Por ahora, solo es una acción sin lógica de inventario completa.
        System.out.println("Cargando producto...");
    }

    public void mostrarProducto() {
        // Muestra la lista de productos disponibles.
        System.out.println("Mostrando productos disponibles...");
    }

    public void seleccionarProducto(Persona persona) {
        // Lógica para que una persona seleccione un producto.
        System.out.println("Persona seleccionando producto...");
    }

    public void recibirDinero(double cantidad) {
        // Acumula el dinero recibido.
        this.dineroRecibido += cantidad;
        System.out.println("Dinero recibido: " + cantidad);
    }
}
