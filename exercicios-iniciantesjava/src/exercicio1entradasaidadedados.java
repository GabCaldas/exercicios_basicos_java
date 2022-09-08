import java.util.Scanner;

public class exercicio1entradasaidadedados {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Digite o primeiro número: ");
        x = soma.nextInt();
        System.out.print("Digite o segundo número: ");
        y = soma.nextInt();
        System.out.printf("A soma entre %d e %d é %d", x, y, x + y);
    }
}
