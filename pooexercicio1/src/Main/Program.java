package Main;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Rectangle rectangle=new Rectangle();
        System.out.print("Digite a Largura do Retângulo: ");
        rectangle.Width=sc.nextDouble();
        System.out.print("Digite a Altura do Retângulo: ");
        rectangle.Height=sc.nextDouble();
        ////////////////////////////////////////////////////
        System.out.print(rectangle);

    }
}
