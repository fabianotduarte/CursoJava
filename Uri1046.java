import java.util.Scanner;
public class Uri1046{
    public static void main(String agrs[]){

        Scanner teclado = new Scanner(System.in);

        int Inicio, Fim, TJ;
        Inicio = teclado.nextInt();
        Fim = teclado.nextInt();

        TJ = Fim - Inicio;

        if (Fim<=Inicio){
            TJ = (24 - Inicio) + Fim;
        }

        System.out.println("O JOGO DUROU " + TJ + " HORA(S)");

    }
}