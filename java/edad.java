import java.util.Scanner;
public class edad {
    public static void main(String[] args) {
        int edad,entr,f;
        double total;
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce tu edad");
        edad=sc.nextInt();
       while (edad<0) {
        System.out.println("ERROR:. introduce una edad válida");
        edad=sc.nextInt();
       }
        if(edad<5){
            System.out.println("tu entrada es gratuita");
            entr=0;
        } else if(edad<12){
            System.out.println("Tu entrada cuesta 5 €");
            entr=5;
        }else if(edad>=65){
            System.out.println("Tu entrada cuesta 3€");
            entr=3;
        }else{
            System.out.println("Tu entrada cuesta 10€");
            entr=10;
        }
        System.out.println("¿tiene carnet de familia numerosa?(0 para si, 1 para no)");
        f=sc.nextInt();
        while(f!=0 && f!=1){
            System.out.println("ERROR:. Comprueba que has introducido bien los datos");
             f=sc.nextInt();
        }
        if(f==0){
            total=0.2*entr;
            System.out.println("El total con el descuento aplicado es "+total+" €");
        }else if(f==1)
            {System.out.println("No se te aplicará ningun descuento");

            }else{
                System.out.println("ERROR:. Comprueba que has introducido bien los datos");
            }
       
}
}
