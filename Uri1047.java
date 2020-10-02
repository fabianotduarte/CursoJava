import java.util.Scanner;
public class Uri1047{
    public static void main(String agrs[]){

        Scanner teclado = new Scanner(System.in);

        int Hini=0, Mini=0, Hfim=0, Mfim=0, TH=0, TM=0;

        Hini = teclado.nextInt();
        Mini = teclado.nextInt();
        Hfim = teclado.nextInt();
        Mfim = teclado.nextInt();

        TH = Hfim - Hini;
        TM = Mfim - Mini;

        if (Hfim<=Hini){
            TH = (24 - Hini) + Hfim;
        }
        if (Mfim<Mini){
            TM = (60 - Mini) + Mfim;
            TH = TH - 1;
        }

        System.out.println("O JOGO DUROU " + TH + " HORA(S) E " + TM +" MINUTO(S)");
    }
}