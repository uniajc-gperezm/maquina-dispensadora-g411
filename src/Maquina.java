import java.util.HashMap;
import java.util.Map;
//import java.util.Map;
public class Maquina {

    private double dinero;
    private Map<String,Producto> inventario = new HashMap<>();

//Constructor

public Maquina(Double dinero, Map inventario)
{
    this.dinero = dinero;
    this.inventario = inventario;
}
}
