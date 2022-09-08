import java.util.Scanner;
import java.util.Locale;

public class exercicio6entradasaidadedados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, areatriangulo, areacirculo, areatrapezio, areaquadrado, arearetangulo, potencia;
        // ENTRADA DOS DADOS
        System.out.print("Valor A: ");
        A = sc.nextDouble();
        System.out.print("Valor B: ");
        B = sc.nextDouble();
        System.out.print("Valor C: ");
        C = sc.nextDouble();

        // CÁLCULO DAS ÁREAS
        areatriangulo = (A * B) / 2;
        potencia = Math.pow(C, 2);
        areacirculo = 3.14159 * potencia;
        areatrapezio = (A + B) * C / 2;
        areaquadrado = B * B;
        arearetangulo = A * B;

        // SAIDA DOS DADOS
        System.out.printf("Área triângulo retângulo: %.3f %n", areatriangulo);
        System.out.printf("Área da circunferência: %.3f %n", areacirculo);
        System.out.printf("Área do trapezio: %.3f %n", areatrapezio);
        System.out.printf("Área do quadrado: %.3f %n", areaquadrado);
        System.out.printf("Área do retângulo: %.3f %n", arearetangulo);


    }
}
