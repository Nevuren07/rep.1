import java.util.Scanner;
public class edad {
    public static void main(String[] args) {
        int edad,precio;
        double total;
        char carnet;
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce tu edad");
        edad=sc.nextInt();
        while (edad<0 || edad>100){
            System.out.println("ERROR:. introduce una edad válida");
            edad=sc.nextInt();
        }
        if(edad<5){
            System.out.println("tu entrada es gratuita");
            precio=0;
        } else if(edad<12){
            System.out.println("Tu entrada cuesta 5 €");
            precio=5;
        }else if(edad>=65){
            System.out.println("Tu entrada cuesta 3€");
            precio=3;
        }else{
            System.out.println("Tu entrada cuesta 10€");
            precio=10;
        }
        System.out.println("¿tiene carnet de familia numerosa?(S/N)");
        carnet=sc.next().charAt(0);
        
        while(carnet!='S' && carnet!='s' && carnet!='N' && carnet!='n'){
            System.out.println("ERROR:. Comprueba que has introducido bien los datos");
            carnet=sc.next().charAt(0);  
        }
         if(edad >= 65){
            System.out.println("No se le aplicará ningun descuento ya que es mayor de 65 años");
        }else if(carnet=='S'|| carnet=='s'){
            total=precio-(precio*0.2);
            System.out.println("Tu entrada con el descuento aplicado costará "+total+"€");
        }else if(carnet=='N' || carnet=='n'){
            System.out.println("No se le aplicará ningun descuento");    
        }
    }
}
