public class Carrito {
 
    public static void main(String[] args) {
        List<Producto> carrito = new ArrayList<>();
        carrito.add(new Producto("Cuaderno", 5000));
        carrito.add(new Producto("Lapicero", 1500));
        carrito.add(new Producto("Mouse", 25000));
 
        double total = 0;
        for (Producto p : carrito) {
            System.out.println(p);
            total += p.getPrecio();
        }
        System.out.println("TOTAL a pagar: $" + total);
 
        // Quitar un producto por posicion
        carrito.remove(1); // quita el Lapicero
        System.out.println("Despues de quitar un producto, quedan: " + carrito.size());
    }
}
 