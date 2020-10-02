import java.util.Scanner;
public class Uri1067{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);
        int valor;

        valor = teclado.nextInt();

        for (int contador = 1; contador <= valor; contador+=2){
            System.out.println(+contador);
        }
    }
}