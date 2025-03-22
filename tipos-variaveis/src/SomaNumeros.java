import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o Terceiro Numero: ");
        int numero3 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3;
        double media = (double) soma / 3;
        System.out.println("A media dos numero e: " + media);
    }
}