package application;
import java.util.Locale;
import java.util.Scanner;
import util.Calculadora;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do dolar atual: ");
        Calculadora.d=sc.nextDouble();
        System.out.print("Digite quantos dólares você quer comprar: ");
        Calculadora.quantosdol=sc.nextDouble();
        System.out.printf("Quanto pagar em reais: %.2f%n", Calculadora.conversao());

    }
}
