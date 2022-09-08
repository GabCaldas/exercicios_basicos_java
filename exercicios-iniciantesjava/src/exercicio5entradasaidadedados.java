import java.util.Scanner;
import java.util.Locale;

public class exercicio5entradasaidadedados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        int codigopeca1;
        int numeropecas1;
        double valorpeca1;
        int codigopeca2;
        int numeropecas2;
        double valorpeca2;
        double valortotal;
        System.out.print("Código primeira peça: ");
        codigopeca1= sc.nextInt();
        System.out.print("Número primeira peça: ");
        numeropecas1= sc.nextInt();
        System.out.print("valor primeira peça: ");
        valorpeca1= sc.nextDouble();
        System.out.println();
        System.out.print("Código segunda peça: ");
        codigopeca2= sc.nextInt();
        System.out.print("Número segundo peça: ");
        numeropecas2= sc.nextInt();
        System.out.print("valor segunda peça: ");
        valorpeca2= sc.nextDouble();
        valortotal=(numeropecas1*valorpeca1)+(numeropecas2*valorpeca2);
        System.out.printf("O valor total a ser pago é de R$%.2f ",valortotal);



    }
}
