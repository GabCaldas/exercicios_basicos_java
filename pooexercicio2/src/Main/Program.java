package Main;
import java.util.Locale;
import java.util.Scanner;
import Entities.funcionario;
public class Program {
    public static void main(String[] args) {
        int p;
        Locale.setDefault(Locale.US);
        funcionario funcionario=new funcionario();
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        funcionario.nome=sc.nextLine();
        System.out.print("Digite seu salário bruto: ");
        funcionario.salariobruto=sc.nextDouble();
        System.out.print("Quanto você precisa pagar de imposto?: ");
        funcionario.imposto=sc.nextDouble();
        //////////////////////////
        System.out.println(funcionario);
        System.out.print("Quantos porcento deseja aumentar o salário?: ");
        funcionario.p= sc.nextDouble();
        System.out.println(funcionario.toString2());
    }
}
