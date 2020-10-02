import java.util.Scanner;
public class Uri1048{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste=0, novo_salario=0;
        int percentual=0;

        salario = teclado.nextDouble();

        if(salario <= 400){
            percentual = 15;
            reajuste = salario * 0.15;
            novo_salario = salario * 1.15;
        }
        else if ((salario > 400) && (salario <= 800)){
            percentual = 12;
            reajuste = salario * 0.12;
            novo_salario = salario * 1.12;
        }
        else if ((salario > 800) && (salario <= 1200)){
            percentual = 10;
            reajuste = salario * 0.10;
            novo_salario = salario * 1.10;
        }
        else if ((salario > 1200) && (salario <= 2000)){
            percentual = 7;
            reajuste = salario * 0.07;
            novo_salario = salario * 1.07;
        }
        else if (salario > 2000){
            percentual = 4;
            reajuste = salario * 0.04;
            novo_salario = salario * 1.04;
        }

        System.out.printf("Novo salario: %.2f\n", novo_salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

    }
}