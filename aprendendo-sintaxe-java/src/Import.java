import java.util.Locale;
import java.util.Scanner;

public class Import {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Obtendo as informacoes do usuario com scanner
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite Sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        //Enviando as informacoes para o terminal
        System.out.println("Meu nome e " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("e tenho " + altura + " de altura");

    }
}