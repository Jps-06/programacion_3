public class MetodosBasicos {
 
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
 
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Maria");
        nombres.add("Pedro");
 
     System.out.println("Cantidad: " + nombres.size());
     System.out.println("Primero: " + nombres.get(0));
     System.out.println("Esta Maria? " + nombres.contains("Maria"));
 
        nombres.remove("Luis");

        System.out.println("Lista final:");
        for (String n : nombres) {
            System.out.println(" - " + n);
        }
    }
}