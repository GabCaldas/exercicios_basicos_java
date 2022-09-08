import java.util.Scanner;
public class exercicio7condicionais {
    public static void main(String[] args) {
        int lernumero;
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite o número: ");
        lernumero= sc.nextInt();
        if (lernumero<0) {
            System.out.println("É negativo");
        }
        else {
            System.out.println("Não é negativo");
        }
    }
}
