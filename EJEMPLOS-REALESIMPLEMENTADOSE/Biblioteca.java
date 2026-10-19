public class Biblioteca {
 
    // Busca un libro por titulo. Devuelve null si no lo encuentra.
    static Libro buscarPorTitulo(List<Libro> libros, String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
 
    static void mostrar(List<Libro> libros) {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca esta vacia.");
            return;
        }
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i));
        }
    }
 
    public static void main(String[] args) {
        List<Libro> biblioteca = new ArrayList<>();
 
        // 1. Agregar libros
        biblioteca.add(new Libro("Cien anos de soledad", "Gabriel Garcia Marquez"));
        biblioteca.add(new Libro("El coronel no tiene quien le escriba", "Gabriel Garcia Marquez"));
        biblioteca.add(new Libro("La voragine", "Jose Eustasio Rivera"));
        System.out.println("--- Libros en la biblioteca ---");
        mostrar(biblioteca);
 
        Libro encontrado = buscarPorTitulo(biblioteca, "La voragine");
        if (encontrado != null) {
            encontrado.setPrestado(true);
            System.out.println("\nSe presto: " + encontrado.getTitulo());
        } else {
            System.out.println("\nNo se encontro el libro.");
        }
 
        int disponibles = 0;
        for (Libro l : biblioteca) {
            if (!l.isPrestado()) {
                disponibles++;
            }
        }
        System.out.println("Libros disponibles: " + disponibles + " de " + biblioteca.size());

        Libro aEliminar = buscarPorTitulo(biblioteca, "El coronel no tiene quien le escriba");
        if (aEliminar != null) {
            biblioteca.remove(aEliminar);
            System.out.println("\nSe elimino: " + aEliminar.getTitulo());
        }
 
        System.out.println("\n--- Libros despues de eliminar ---");
        mostrar(biblioteca);
 
        biblioteca.clear();
        System.out.println("\n--- Despues de clear() ---");
        mostrar(biblioteca);
    }
}