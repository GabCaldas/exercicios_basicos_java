import java.util.Scanner;
import java.util.Locale;
public class exercicio13condicionais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor1;
        double valor2;
        System.out.print("Digite o primeiro valor: ");
        valor1= sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valor2= sc.nextDouble();
        if (valor1>0 && valor2>0){
            System.out.println("Q2");
        }
        else if (valor1>0 && valor2<0){
            System.out.println("Q4");
        }
        else if (valor1<0 && valor2>0){
            System.out.println("Q2");
        }
        else if (valor1<0 && valor2<0){
            System.out.println("Q3");
        }
        else if (valor1==0 && valor2==0){
            System.out.println("Origem");
        }
        else if(valor1==0){
            System.out.println("Eixo Y");
        }
        else if (valor2==0){
            System.out.println("Eixo X");
        }
        else if (valor1==valor2){
            System.out.println("Q1");
        }
    }
}
