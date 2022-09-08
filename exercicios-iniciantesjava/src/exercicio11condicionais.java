import java.util.Scanner;
import java.util.Locale;
public class exercicio11condicionais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        double código;
        double preço;
        double quantidade;
        double preçototal;
        System.out.print("Digite o código do produto: ");
        código= sc.nextDouble();
        if (código==1){
            double quantidadehotdog;
            preço=4.0;
            System.out.print("Quantidade: ");
            quantidadehotdog= sc.nextDouble();
            preçototal=quantidadehotdog*preço;
            System.out.printf("O preço total do seu pedido é: %.2f",preçototal);

        }
        else if (código==2){
            double quantidadexsalada;
            preço=4.5;
            System.out.print("Quantidade: ");
            quantidadexsalada=sc.nextDouble();
            preçototal=quantidadexsalada*preço;
            System.out.printf("O preço total do seu pedido é: %.2f R$",preçototal);

        }
        else if (código==3){
            double quantidadexbacon;
            preço=5.0;
            System.out.print("Quantidade: ");
            quantidadexbacon=sc.nextDouble();
            preçototal=quantidadexbacon*preço;
            System.out.printf("O preço total do seu pedido é: %.2f R$",preçototal);
        }
        else if (código==4){
            double quantidadetorrada;
            preço=2.0;
            System.out.print("Quantidade: ");
            quantidadetorrada=sc.nextDouble();
            preçototal=quantidadetorrada*preço;
            System.out.printf("O preço total do seu pedido é: %.2f R$",preçototal);
        }
        else if (código==5){
            double quantidaderefri;
            preço=1.5;
            System.out.println("Quantidade: ");
            quantidaderefri=sc.nextDouble();
            preçototal=quantidaderefri*preço;
            System.out.printf("O preço total do seu pedido é: %.2f R$",preçototal);
        }
    }

}
