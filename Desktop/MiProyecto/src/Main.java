public class Main {
    public static void main(String[] args) {
        
        Producto arroz = new Producto("ASHTREUI", "Arroz", 2, 5000.0);
        
       
        arroz.desplegarInfo();
        
        
        double totalArroz = arroz.getPrecio() * arroz.getCantidad();
        System.out.println("Total del producto: $" + totalArroz);
        System.out.println("-----------------------------");

        
        Producto shampoo = new Producto("YHEUSOP", "Shampoo", 1, 17000.0);
        
        
        shampoo.desplegarInfo();
        
     
        double totalShampoo = shampoo.getPrecio() * shampoo.getCantidad();
        System.out.println("Total del producto: $" + totalShampoo);
    }
}