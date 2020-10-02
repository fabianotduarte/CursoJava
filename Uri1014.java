import java.util.Scanner;
public class Uri1014{
    public static void main(String sgrs[]){

    Scanner teclado = new Scanner(System.in);

    int X;
    float Y, Media;

    X = teclado.nextInt();
    Y = teclado.nextFloat();

    Media = X/Y;

    System.out.printf("%.3f km/l\n",Media);
    
    }
}