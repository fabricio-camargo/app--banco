import java.util.Scanner;

public class DadosBancarios {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    // Construtor
    public DadosBancarios() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        this.nome = scanner.nextLine();

        System.out.println("Informe seu sobrenome:");
        this.sobrenome = scanner.nextLine();

        System.out.println("Informe seu CPF:");
        this.cpf = scanner.nextLine();

        // Saldo inicial é zero
        this.saldo = 0.0;

        System.out.println("Conta criada com sucesso!\n");
    }

    // Método para realizar depósito
    public void realizarDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito. Tente novamente.");
        }
    }

    // Método para realizar saque
    public void realizarSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque. Tente novamente.");
        }
    }

    // Método para consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}