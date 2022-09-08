import java.util.Scanner;
public class exercicio3entradasaidadedados {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int A,B,C,D;
        int diferencaproduto;
        System.out.print("Digite o valor de A,B,C e D respectivamente!: ");
        A = numeros.nextInt();
        B = numeros.nextInt();
        C = numeros.nextInt();
        D = numeros.nextInt();
        diferencaproduto=(A-B)*(C-D);
        System.out.printf("A diferença do produto de A-B pelo de C-D é: %d", diferencaproduto);
    }
}
