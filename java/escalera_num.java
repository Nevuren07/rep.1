import java.util.Scanner;
public class escalera_num {
    public static void main(String[] args){
        int n,fila,cifra;
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce el numero de filas que quieres que tenga esta escalera 1-9");
        n=sc.nextInt();
        System.out.println("tu escalera es:");
        while(n<1 || n>9){
            System.out.println("ERROR:. El número de filas debe estar comprendido entre el 1 y el 9");
            n=sc.nextInt();
        }
         fila=1;
     while (fila<=n){
         cifra=1;
         while(cifra<=fila){
             System.out.print(cifra);
             cifra++;
            }
         System.out.println();
         fila++;
        }
    }
}