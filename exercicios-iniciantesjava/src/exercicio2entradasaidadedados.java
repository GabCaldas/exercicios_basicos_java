import java.util.Scanner;
import java.util.Locale;

public class exercicio2entradasaidadedados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leraio = new Scanner(System.in);
        double x;
        double areacirculo;
        double potencia;
        System.out.print("Digite o raio a ser calculado!: ");
        x = leraio.nextDouble();
        potencia = Math.pow(x, 2);
        areacirculo = 3.14159 * potencia;
        System.out.printf("A área da circuferência desse raio é %.4f", areacirculo);
    }

}
