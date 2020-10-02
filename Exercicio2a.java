import java.util.Scanner;
public class Calculadora{
public static void main(String args[]){

    double Quadrado;
    double Lado_quadrado;
    double Retangulo;
    double Base_retangulo;
    double Altura_retangulo;
    double Triangulo;
    double Base_triangulo;
    double Altura_triangulo;
    double Losangulo;
    double Lateral1_losangulo;
    double Lateral2_losangulo;
    double Trapezio;
    double Lado1_trapezio;
    double Lado2_trapezio;
    double Altura_trapezio;
    double Paralelepipedo;
    double Altura_paralelepipedo;
    double Largura_paralelepipedo;
    double Profundidade_paralelepipedo;
    double Cubo;
    double Lado_cubo;
    double Cilindro;
    double Raio_cilindro;
    double Altura_cilindro;

    Scanner teclado;

    teclado = new Scanner(System.in);

    System.out.println("Calculo da área do Quadro. Digite a medida da Lateral:");
    Lado_quadrado = teclado.nextDouble();
    Quadrado = Lado_quadrado*Lado_quadrado;
    System.out.println("Area do quadrado = " + Quadrado);

    System.out.println("\nCalculo da área do Retângulo. Digite a medida da base do Retângulo:");
    Base_triangulo = teclado.nextDouble();
    System.out.println("Calculo da área do Retângulo. Digite a medida da altura do Retângulo:");
    Altura_triangulo = teclado.nextDouble();
    Triangulo = (Base_triangulo*Altura_triangulo)/2;
    System.out.println("Area do quadrado = " + Triangulo);

    System.out.println("\nCalculo da área do Triângulo. Digite a medida da base do Triângulo:");
    Base_triangulo = teclado.nextDouble();
    System.out.println("Calculo da área do Triângulo. Digite a medida da base do Triângulo:");
    Altura_triangulo = teclado.nextDouble();
    Triangulo = (Base_triangulo*Altura_triangulo)/2;
    System.out.println("Area do quadrado = " + Triangulo);


}
}