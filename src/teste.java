import java.util.Scanner;

public class teste {
    public static Scanner tec = new Scanner(System.in);
     public static conta c1 = new conta();

    public static void opAPP(){
        System.out.println("/////BANCO SENAC/////");
        System.out.println("1 - Criar conta");
        System.out.println("2- Entrar na conta");
        System.out.println("3- Sair do Banco Senac");
        System.out.print("OPÇÃO: ");
     }
     public static void EntrarConta(){
        boolean Vf = false;
        while (!Vf) {
            String cpf;
            System.out.print("Digite seu Cpf: ");
            cpf = tec.next();
            if(cpf.equals(c1.getCpf())) {
                Vf = true;
            }  else{
                System.out.println("Cpf incorreto, tente novamente");
            }   
                
        }
     }
     public static void opBanco(){
        System.out.println("/////BANCO SENAC/////");
        System.out.println("Usuário: ");
        System.out.println("1- Exebir saldo");
        System.out.println("2- Depósito");
        System.out.println("3- Saque");
        System.out.println("4- Transferencia");
        System.out.println("5- Sair da conta");
        System.out.print("OPÇÃO: ");
     }
    
    public static void main(String[] args) {
        int op;
        boolean stop = false;
        while(stop == false){
            opAPP();
            op=tec.nextInt();
        switch (op) {
            case 1:
                c1.criarConta();
                break;
            case 2:
                EntrarConta();
                boolean off = false;
                while (off == false) {
                    opBanco();
                    op = tec.nextInt();
                    switch (op) {
                        case 1:
                            c1.saldo();
                            break;
                        case 2:
                            c1.deposito();
                            break;
                        case 3:
                            c1.saque();
                            break;
                        case 4:
                            c1.Transf();
                            break;
                        default:
                            off = true;
                            System.out.println("SAINDO DA CONTA");
                            break;
                    }
                }//WHILE
                break;
            default:
                System.out.println("SAINDO DA CONTA");
                stop = true;
                break;
        }//switch
    }//while



    }//main
}//class
