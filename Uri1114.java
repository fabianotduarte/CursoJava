import java.util.Scanner;
public class Uri1114{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);

       int Senha;

        do{
            Senha = teclado.nextInt();
            if(Senha != 2002){
                System.out.println("Senha Invalida");
            }
        }while(Senha != 2002);
        System.out.println("Acesso Permitido");
    }
}