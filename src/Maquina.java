import java.util.HashMap;
import java.util.Map;

public class Maquina {

    private double dineroRecibido;
    private Map<String,Producto> inventario = new HashMap<>();  
    
    public Maquina (double dineroRecibido){
      this.dineroRecibido = dineroRecibido;
  }

  public double getDineroRecibido(){
    return dineroRecibido;
  }

  public void setDineroRecibido (double dineroRecibido){
  this.dineroRecibido = dineroRecibido;
  }

  public void cargarProducto (){
  }

  public void mostrarProducto(){
  }

  public void seleccionarProducto(){
  }

  public void recibirDinero (double cantidad){
    this.dineroRecibido += cantidad;
    System.out.println("El dinero recibido es: $ " + this.dineroRecibido);
    
  }

  

}

 