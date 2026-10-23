import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        int a, b, i, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        a = sc.nextInt();
        System.out.println("Introduce el segundo número");
        b = sc.nextInt();

        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        i = a;
        total = 0;
        while (i <= b) {
            System.out.println(i);
            total = total + i;
            i = i + 1;
        }
        System.out.println("la suma de los numeros entre " + a + " y " + b + " es " + total);
    }
}
