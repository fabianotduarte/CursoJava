import java.util.Scanner;
public class Uri1010{
    public static void main(String sgrs[]){
        Scanner teclado = new Scanner(System.in);

        int codigo1, qtd1, codigo2, qtd2;
        float valor1, valor2, total;

        codigo1 = teclado.nextInt();
        qtd1 = teclado.nextInt();
        valor1 = teclado.nextFloat();
        codigo2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        valor2 = teclado.nextFloat();

        total = qtd1*valor1 + qtd2*valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

    }
}