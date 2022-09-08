import java.util.Scanner;

public class exercicio8condicionais {
    public static void main(String[] args) {
        int lernumero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");

        lernumero = sc.nextInt();
        if (lernumero % 2==0) {
            System.out.println("É par");
        }
        else {
            System.out.println("é ímpar");
        }
    }
}
