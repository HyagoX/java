import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            float altura = scanner.nextFloat();

            System.out.println("Ola meu nome e " + nome + " " + sobrenome);
            System.out.println("tenho " + idade + " anos de idade");
            System.out.println("tenho " + altura + " de altura");
        }
        catch (InputMismatchException e){
        System.err.println("Os campos idade e altura precisam ser numericos");

    }
    }
}
