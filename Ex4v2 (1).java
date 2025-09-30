import java.util.Scanner;

public class Ex4v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sair;
        int po;
        int caixa;
        int so;
        int ni = 124;
        double cili;
        String carro = "";

        do {
            System.out.println("Qual a marca do teu carro?");
            System.out.println("1-Audi");
            System.out.println("2-BMW");
            System.out.println("3-Outro");
            po = scanner.nextInt();

            switch (po) {
                case 1:
                    System.out.println("O teu carro é um Audi e é um carro alemão");
                    System.out.println("Quantas cilindradas tem o teu carro?");
                    cili = scanner.nextDouble();

                    System.out.println("Quais as tuas mudanças?");
                    System.out.println("1-Automaticas");
                    System.out.println("2-Manual");
                    caixa = scanner.nextInt();

                    System.out.println("NºIdentificação: " + ni);
                    System.out.println("Quer alterar?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    so = scanner.nextInt();

                    if (so == 1) {
                        System.out.println("Escreve o NºIdentificação:");
                        ni = scanner.nextInt();
                    }

                    System.out.println("Obrigado volte sempre");
                    break;
                case 2:
                    System.out.println("O teu carro é um BMW e é um carro alemão");
                    System.out.println("Quantas cilindradas tem o teu carro?");
                    cili = scanner.nextDouble();

                    System.out.println("Quais as tuas mudanças?");
                    System.out.println("1-Automaticas");
                    System.out.println("2-Manual");
                    caixa = scanner.nextInt();

                    System.out.println("NºIdentificação: " + ni);
                    System.out.println("Quer alterar?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    so = scanner.nextInt();

                    if (so == 1) {
                        System.out.println("Escreve o NºIdentificação:");
                        ni = scanner.nextInt();
                    }

                    System.out.println("Obrigado volte sempre");
                    break;
                default:
                    System.out.println("Qual a marca do teu carro?");
                    scanner.nextLine();
                    carro = scanner.nextLine();

                    System.out.println("O teu carro é um " + carro);
                    System.out.println("Quantas cilindradas tem o teu carro?");
                    cili = scanner.nextDouble();

                    System.out.println("Quais as tuas mudanças?");
                    System.out.println("1-Automaticas");
                    System.out.println("2-Manual");
                    caixa = scanner.nextInt();

                    System.out.println("NºIdentificação: " + ni);
                    System.out.println("Quer alterar?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    so = scanner.nextInt();

                    if (so == 1) {
                        System.out.println("Escreve o NºIdentificação:");
                        ni = scanner.nextInt();

                    }

                    System.out.println("Obrigado volte sempre");
                    break;
            }

            System.out.println("\n\nInformações:");
            if (po == 1){
                System.out.println("O teu carro é um Audi e é um carro alemão");
            }else if (po == 2) {
                System.out.println("O teu carro é um BMW e é um carro alemão");
            }else {
                System.out.println("O teu carro é um " + carro);
            }
            if (cili >= 2000){
                System.out.println("Motor potente");
            }else {
                System.out.println("Motor moderado");
            }
            if (caixa == 1){
                System.out.println("Caixa automatica");
            }else {
                System.out.println("Caixa manual");
            }
            System.out.println("NºIdentificação: " + ni);

            System.out.println("\nSe quiseres sair do programa escreve (sair)");
            scanner.nextLine();
            String fp = scanner.nextLine();

            if (fp.equalsIgnoreCase("sair")) {
                sair = 0;
            } else {
                sair = 1;
            }
        }while(sair==1);
    }
}
