import java.util.Scanner;

public class exercicio9condicionais {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = sc.nextInt();
        if (numero1>numero2) {
            if (numero1%numero2==0){
                System.out.println("São múltiplos");}
            else {
                System.out.println("Não são múltiplos");}
        }
        else if (numero2>numero1) {
            if (numero2%numero1==0){
                System.out.println("São múltiplos");}
            else {System.out.println("Não são múltiplos");}
        }
    }
}
