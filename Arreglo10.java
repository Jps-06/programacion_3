public class Arreglo10 {
    public static void main(String[] args) {
    
        //CREAR EL ARREGLO
        int [] a = {8,5,3,10,2,8,1};

        //MOSTRAR AREGLO A
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }  

        //ARREGLO B
        int bLength = a.length / 2;
        int[] b = new int[bLength];

        //SUMAMOS
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i] + a[a.length - 1 - i];
        }

        //MOSTRAR AREGLO B
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]); 
        }
    }
}