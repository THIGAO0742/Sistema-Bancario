import java.util.Scanner;
public abstract class pessoa {
    Scanner ler = new Scanner(System.in);
        protected String nome;
        protected int cpf;
        protected int idade;
        
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getCpf() {
            return cpf;
        }
        public void setCpf(int cpf) {
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
            while (Vf == false) {
                System.out.println("Digite seu CPF: ");
                this.cpf= ler.nextInt();
                String cf;
                cf = Integer.toString(this.cpf);
                if (cf.length() == 11 && cf.matches("//d{11}")) {
                    Vf = true;
                } else {
                    System.out.println("CPF INVALIDO, DIGITE NOVAMETE!!");
                }
            }
    

    
    }
}
