public class Persona {
  private String nombre;
  private double dinero;

  public Persona(String nombre, double dinero) {
    this.nombre = nombre;
    this.dinero = dinero;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getDinero() {
    return dinero;
  }

  public void setDinero(double dinero) {
    this.dinero = dinero;
  }

  public void recibirProducto(Producto producto) {
    System.out.println("La persona " + this.nombre + " ha recibido el producto: ");
  }

  public void recibirCambio(double cambio) {
    this.dinero += cambio;
    System.out.println("La persona " + this.nombre + " ha recibido un cambio de: " + cambio);
  }
}
