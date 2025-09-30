import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello, world!\n");

        System.out.printf("Qual o teu nome?\n");
        String nome = scanner.nextLine();

        System.out.printf("Ola "+ nome);
    }
}