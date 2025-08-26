import java.util.Map;

public class Maquina {

private double dineroRecibido;
private Map inventarioMap;

public Maquina(double dineroRecibido, Map inventarioMap) {
    this.dineroRecibido = dineroRecibido;
    this.inventarioMap = inventarioMap;
}

public double getDineroRecibido() {
    return dineroRecibido;
}

public void setDineroRecibido(double dineroRecibido) {
    this.dineroRecibido = dineroRecibido;
}

public Map getInventarioMap() {
    return inventarioMap;
}

public void setInventarioMap(Map inventarioMap) {
    this.inventarioMap = inventarioMap;
}

public void cargarProducto (Producto producto) {

}

public void mostrarProducto (){

}

public void seleccionarProducto(Persona persona){

}



}
