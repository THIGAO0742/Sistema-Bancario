import java.util.Scanner;

public class teste {
     
    public static void opAPP(){
        System.out.println("/////BANCO SENAC/////");
        System.out.println("1 - Criar conta");
        System.out.println("2- Entrar na conta");
        System.out.println("3- Sair do Banco Senac");
        System.out.print("OPÇÃO: ");
     }
     public static void EntrarConta(){

     }
     public static void opBanco(){
        System.out.println("/////BANCO SENAC/////");
        System.out.println("Usuário: ");
        System.out.println("2- Entrar na conta");
        System.out.println("3- Sair do Banco Senac");
        System.out.print("OPÇÃO: ");
     }
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int op;
        boolean stop = false;
        conta principa = new conta();

        while(stop == false){
            opAPP();
            op=tec.nextInt();
        switch (op) {
            case 1:
                principa.criarConta();
                break;
            case 2:
                EntrarConta();
                boolean off = false;
                while (off == false) {
                    op = tec.nextInt();
                    switch (principa) {
                        case 1:
                            
                            break;
                    
                        default:
                            break;
                    }
                }
                break;
            default:
                System.out.println("SAINDO DA CONTA");
                stop = true;
                break;
        }//switch
    }//while



    }//main
}//class
