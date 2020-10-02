import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor, somatoria=0, media=0;
        int numPositivo=0;

        for (int contador = 1; contador <= 6; contador++){
            valor = teclado.nextFloat();
            if (valor >0){
                numPositivo++;
                somatoria = somatoria+valor;
            }
        }
        System.out.println(+numPositivo + " valores positivo");
        media = somatoria / numPositivo;
        System.out.printf("%.1f\n", media);
    }
}
