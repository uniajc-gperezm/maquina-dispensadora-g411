public class Producto {

    private String Codigo;
    private String nombreProducto;
    private int cantidad;
    private double precio;

    //Constructor

    public Producto(String codigo, String nombreProducto, int cantidad, double precio)
    {
        this.Codigo = codigo;
        this.nombreProducto =  nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
