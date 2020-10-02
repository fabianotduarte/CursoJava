import java.util.Scanner;
public class Uri1134{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);

        int valor=0, alcool=0, gasolina=0, diesel=0;

        while(valor !=4){
            valor = teclado.nextInt();
            if(valor==1){
                alcool++;
            }
            if(valor==2){
                gasolina++;
            }
            if(valor==3){
                diesel++;
            }
        }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);
    }
}