import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação da instância da classe de dados pessoais e operações bancárias
        DadosBancarios dadosBancarios = new DadosBancarios();

        int escolha;
        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe o valor do depósito:");
                    double valorDeposito = scanner.nextDouble();
                    dadosBancarios.realizarDeposito(valorDeposito);
                    break;

                case 2:
                    System.out.println("Informe o valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    dadosBancarios.realizarSaque(valorSaque);
                    break;

                case 3:
                    dadosBancarios.consultarSaldo();
                    break;

                case 4:
                    System.out.println("Aplicação encerrada. Permenecemos à disposição!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (escolha != 4);

        scanner.close();
    }

    // Método para exibição do menu
    private static void exibirMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. Realizar depósito");
        System.out.println("2. Realizar saque");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Encerrar aplicação");
        System.out.println("Escolha uma opção:");
    }
}