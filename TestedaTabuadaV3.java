import java.util.Scanner;
public class TestedaTabuadaV3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num, contador;

        System.out.println("Digite o numero da tabuada:");
        num = teclado.nextInt();

        for (contador=1 ; contador<=10 ; contatdor = contador = 1){
            System.out.println(num + " x " + contador + " = " + (num*contador));
        }

    }
}