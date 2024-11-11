import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;

        // SUBINDO O PROJETO PARA O GITHUB
        if (Arrays.stream(args).count() > 0) {
            System.out.printf("Hello and welcome, " + args[0] + "!");
            return;
        }
        System.out.println("Please, tell your name: ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.next();
        System.out.printf("Hello and welcome, " + nome + "!");
    }
}