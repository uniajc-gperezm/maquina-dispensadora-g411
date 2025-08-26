public class Producto {
    // Atributos
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    // Constructor
    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Métodos
    public void dispensa() {
        if (cantidad > 0) {
            cantidad--;
            System.out.println("Dispensando: " + nombre);
        } else {
            System.out.println("Producto agotado.");
        }
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " | Precio: $" + precio + " | Stock: " + cantidad;
    }
}
