import java.util.Scanner;
public class Uri1142{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);

        int linhas, valor1, valor2, valor3;

        linhas = teclado.nextInt();

        if(linhas>0){
            for(int contador=1; contador <=linhas; contador++){
                valor1 = 1 + ((contador-1)*4);
                valor2 = 2 + ((contador-1)*4);
                valor3 = 3 + ((contador-1)*4);

                System.out.println(valor1 + " " + valor2 + " " + valor3 + " PUM");
            }
        }
    }
}