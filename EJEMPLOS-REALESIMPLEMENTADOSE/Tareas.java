import java.util.ArrayList;
import java.util.List;
 
 //Lista de tareas pendientes

class Tarea {
    private String descripcion;
    private boolean terminada;
 
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.terminada = false;
    }
 
    public String getDescripcion() { return descripcion; }
    public boolean isTerminada() { return terminada; }
    public void terminar() { this.terminada = true; }
 
    
    public String toString() {
        return (terminada ? "[X] " : "[ ] ") + descripcion;
    }
}
 
public class Tareas {
 
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("Estudiar para el parcial"));
        tareas.add(new Tarea("Entregar el taller de POO"));
        tareas.add(new Tarea("Hacer la AF2"));
 
        // Marcar una como terminada
        tareas.get(1).terminar();
 
        // Mostrar todas
        for (Tarea t : tareas) {
            System.out.println(t);
        }
 
        // Contar pendientes
        int pendientes = 0;
        for (Tarea t : tareas) {
            if (!t.isTerminada()) {
                pendientes++;
            }
        }
        System.out.println("Tareas pendientes: " + pendientes);
    }
}
 