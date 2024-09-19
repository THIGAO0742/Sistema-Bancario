import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    private static ArrayList<pessoa> pessoas = new ArrayList<>();
    private static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        boolean stop = false;

        while (!stop) {
            opAPP();
            op = tec.nextInt();
            tec.nextLine();  // Consume newline

            switch (op) {
                case 1:
                    criarPessoa();
                    break;
                case 2:
                    entrarNaConta();
                    break;
                case 3:
                    stop = true;
                    System.out.println("Saindo do Banco Senac");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void opAPP() {
        System.out.println("/////BANCO SENAC/////");
        System.out.println("1 - Criar pessoa");
        System.out.println("2 - Entrar na conta");
        System.out.println("3 - Sair do Banco Senac");
        System.out.print("OPÇÃO: ");
    }

    public static void criarPessoa() {
        pessoa pessoa = new pessoa();
        pessoa.lerDados();
        pessoas.add(pessoa);
        System.out.println("Pessoa criada com sucesso!");
    }

    public static void entrarNaConta() {
        System.out.print("Digite seu CPF: ");
        String cpf = tec.nextLine();

        pessoa pessoa = buscarPessoaPorCpf(cpf);
        if (pessoa != null) {
            System.out.println("Pessoa encontrada. Escolha a conta:");
            pessoa.mostrarContas();
            System.out.print("Digite o número da conta: ");
            String numeroConta = tec.nextLine();
            conta conta = pessoa.buscarConta(numeroConta);
            if (conta != null) {
                opBanco(conta);
            } else {
                System.out.println("Conta não encontrada!");
            }
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

    public static pessoa buscarPessoaPorCpf(String cpf) {
        for (pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public static void opBanco(conta conta) {
        int op;
        boolean off = false;

        while (!off) {
            System.out.println("/////BANCO SENAC/////");
            System.out.println("1 - Exibir saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Transferência");
            System.out.println("5 - Sair da conta");
            System.out.print("OPÇÃO: ");
            op = tec.nextInt();
            tec.nextLine();  // Consume newline

            switch (op) {
                case 1:
                    System.out.println("Saldo: R$" + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    double valorDeposito = tec.nextDouble();
                    conta.deposito(valorDeposito);
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    double valorSaque = tec.nextDouble();
                    conta.saque(valorSaque);
                    break;
                case 4:
                    System.out.print("Valor da transferência: ");
                    double valorTransferencia = tec.nextDouble();
                    conta.transferencia(valorTransferencia);
                    break;
                case 5:
                    off = true;
                    System.out.println("Saindo da conta.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}