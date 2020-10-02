import java.util.Scanner;
public class Uri1066{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);
        int valor=0, Par=0, Impar=0, Positivo=0, Negativo=0;

        for (int contador = 1; contador <= 5; contador++){
            valor = teclado.nextInt();
            if (valor % 2 ==0){
                Par++;
            }
            if ((valor % 2 ==1) || (valor % 2 ==-1)){
                Impar++;
            }
            if (valor > 0){
                Positivo++;
            }
            if (valor < 0){
                Negativo++;
            }
        }
        System.out.println(+Par + " valor(es) par(es)");
        System.out.println(+Impar + " valor(es) impar(es)");
        System.out.println(+Positivo + " valor(es) positivo(s)");
        System.out.println(+Negativo + " valor(es) negativo(s)");
    }
}