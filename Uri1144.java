import java.util.Scanner;
public class Uri1144{
    public static void main(String sgrs[]){
        Scanner teclado = new Scanner(System.in);

        int linhas, valor1=0, valor2=0, valor3=0;

        linhas = teclado.nextInt();

        for(int contador=1; contador <=linhas; contador++){
            valor1 = contador;
            valor2 = contador*contador;
            valor3 = contador*contador*contador;
            System.out.println(valor1 + " " + valor2 + " " +valor3);

            valor2 = valor2+1;
            valor3 = valor3+1;
            System.out.println(valor1 + " " + valor2 + " " +valor3);
        }

    }
}