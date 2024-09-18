import java.util.Scanner;
public  class pessoa {
    Scanner ler = new Scanner(System.in);
        private String nome;
        private String cpf;
        private int idade;
        
        pessoa (){}

        public pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        }

        public String getNome() {
            return this.nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCpf() {
            return this.cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public int getIdade() {
            return this.idade;
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
            this.cpf = ler.next();  
          

            if (cpf.length() == 11 && cpf.matches("\\d{11}")) {
                Vf = true;
            } else {
                System.out.println("CPF INVÁLIDO, DIGITE NOVAMENTE!!");
            }
        }
    

    
    }
}