import java.util.Scanner;
public  class pessoa {
    Scanner ler = new Scanner(System.in);
        protected String nome;
        protected long cpf;
        protected int idade;
        
        pessoa (){}

        public pessoa(String nome, int cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public long getCpf() {
            return cpf;
        }
        public void setCpf(long cpf) {
            this.cpf = cpf;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }

    public void LerDados(){
        System.out.println("Digite Seu Nome: ");
        this.nome = ler.nextLine();
        System.out.println("Digite Sua Idade: ");
        this.idade = ler.nextInt();
           
        boolean Vf = false;
        while (!Vf) {
            System.out.println("Digite seu CPF (11 dígitos): ");
            this.cpf = ler.nextLong();  // Alterado para nextLong()
            String cf = Long.toString(this.cpf);

            if (cf.length() == 11 && cf.matches("\\d{11}")) {
                Vf = true;
            } else {
                System.out.println("CPF INVÁLIDO, DIGITE NOVAMENTE!!");
            }
        }
    

    
    }
}