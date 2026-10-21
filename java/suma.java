import java.util.Scanner;
public class suma {
    public static void main(String[] args){
        int a,b,i,total;
    Scanner sc= new Scanner(System.in) ;
    System.out.println("Introduce un número");
    a=sc.nextInt();
    System.out.println("Introduce el segundo número");
    b=sc.nextInt();
    i=a;
    total=0;
    while(i<=b){ 
       total=total+i;
     }
    System.out.println(total);
    } 
}  
