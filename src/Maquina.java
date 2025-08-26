import java.util.HashMap;
import java.util.Map;

public class Maquina {



public class Inventario {

    // Declaración del atributo Map
    private Map<String, Integer> productos;

    public Inventario() {
        // Inicialización en el constructor
        this.productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, Integer cantidad) {
        this.productos.put(nombre, cantidad);
    }
}

}
