import java.util.Scanner;

public class exercicio4entradasaidadedados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerofuncionario;
        int horastrabalhadas;
        double valorporhora;
        double salario;
        System.out.print("Digite seu número: ");
        numerofuncionario = sc.nextInt();
        System.out.print("Agora quantas horas você trabalha no dia: ");
        horastrabalhadas = sc.nextInt();
        System.out.print("Quanto você ganha por hora?: ");
        valorporhora = sc.nextDouble();
        salario = horastrabalhadas * valorporhora;
        System.out.printf("Funcionário %d, seu salário é de R$%.2f",numerofuncionario,salario);
    }
}
