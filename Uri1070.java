import java.util.Scanner;
public class Uri1070{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);

        int valor, X=0;

        valor = teclado.nextInt();
        if (valor % 2 ==0){
            valor = valor +1;
        }
        for (int contador = 1; contador <= 6; contador++){
            System.out.println(+valor);
            valor+=2;
        }        
    }
}