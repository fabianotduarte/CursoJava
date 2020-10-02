import java.util.Scanner;
public class Uri1073{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);

        int N;

        N = teclado.nextInt();

        for (int contador=2 ; contador <=N ; contador+=2){
            System.out.println(contador + "^2" + " = " +contador*contador);
        }
    }
}