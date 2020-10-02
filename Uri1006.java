import java.util.Scanner;
public class Uri1006{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        MEDIA = (A*0.2)+(B*0.3)+(C*0.5);

        System.out.printf("MEDIA = %.1f\n",MEDIA);

    }
}