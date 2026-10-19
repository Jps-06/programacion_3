
public class Estudiante {
 
    public static void main(String[] args) {
        List<Estudiante> curso = new ArrayList<>();
        curso.add(new Estudiante("Ana", 4.5));
        curso.add(new Estudiante("Luis", 3.2));
        curso.add(new Estudiante("Maria", 4.8));
        curso.add(new Estudiante("Pedro", 2.9));
 
        double suma = 0;
        for (Estudiante e : curso) {
            System.out.println(e);
            suma += e.getNota();
        }
        double promedio = suma / curso.size();
        System.out.println("Promedio del curso: " + promedio);
 
        // Quienes aprobaron (nota >= 3.0)
        System.out.println("Aprobaron:");
        for (Estudiante e : curso) {
            if (e.getNota() >= 3.0) {
                System.out.println(" - " + e.getNombre());
            }
        }
 
        // Mejor estudiante
        Estudiante mejor = curso.get(0);
        for (Estudiante e : curso) {
            if (e.getNota() > mejor.getNota()) {
                mejor = e;
            }
        }
        System.out.println("Mejor nota: " + mejor);
    }
}