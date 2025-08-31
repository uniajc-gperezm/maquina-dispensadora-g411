public class Producto {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

public Producto (String codigo, String nombre, int cantidad, double precio){
    this.codigo = codigo;
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.precio = precio;

}

public String getCodigo(){
    return this.codigo;
}

public String getNombre(){
    return this.nombre;
}

public int getCantidad(){
    return this.cantidad;
}

public double getPrecio(){
    return this.precio;
}


public void desplegarInfo(){

System.out.println("Codigo producto: " + codigo);  
System.out.println("Nombre producto: " + nombre);
System.out.println("Cantidad de productos: " + cantidad);
System.out.println("Precio producto/s: " + precio);
}


}


    