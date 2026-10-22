import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce el número de el cual quieres calcular el factorial");
        int n=sc.nextInt();
        int c=1;
        while(n>c){
            int cif=n;
            
            while (cif>=c) {
                int fac;
                System.out.print(cif+"x");
                cif--;
            
                fac=cif*cif;
                    System.out.print("="+fac);
            }
            n--;
            System.out.println();
        }
        
    }
}
