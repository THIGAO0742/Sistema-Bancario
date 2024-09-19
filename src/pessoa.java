import java.util.ArrayList;
import java.util.Scanner;

public class pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private ArrayList<conta> contas;

    public pessoa() {
        contas = new ArrayList<>();
    }

    public pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.contas = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<conta> getContas() {
        return contas;
    }

    public void adicionarConta(conta conta) {
        contas.add(conta);
    }

    public conta buscarConta(String numeroConta) {
        for (conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }

    public void mostrarContas() {
        for (conta conta : contas) {
            System.out.println("Conta: " + conta.getNumeroConta() + " - Saldo: " + conta.getSaldo());
        }
    }

    public void lerDados() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite Seu Nome: ");
        this.nome = ler.nextLine();
        System.out.println("Digite Sua Idade: ");
        this.idade = ler.nextInt();
        ler.nextLine();  // Consume the newline left-over

        boolean vf = false;
        while (!vf) {
            System.out.println("Digite seu CPF (11 dígitos): ");
            this.cpf = ler.nextLine();

            if (cpf.length() == 11 && cpf.matches("\\d{11}")) {
                vf = true;
            } else {
                System.out.println("CPF INVÁLIDO, DIGITE NOVAMENTE!!");
            }
        }
    }
}