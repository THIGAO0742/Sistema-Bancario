import java.util.Scanner;

public class conta extends pessoa {
    Scanner tec = new Scanner(System.in);
   private int nConta, nAgencia;
   private double saldo,saque,deposito,Transf;
   
   //construct
   conta(){};
   
   public conta(Scanner tec, int nConta, int nAgencia, double saldo, double saque, double deposito, double transf) {
   this.tec = tec;
   this.nConta = nConta;
   this.nAgencia = nAgencia;
   this.saldo = saldo;
   this.saque = saque;
   this.deposito = deposito;
   this.Transf = transf;
}


//get set



    public Scanner getTec() {
        return tec;
    }

    public int getnConta() {
        return nConta;
    }

    public int getnAgencia() {
        return nAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaque() {
        return saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getTransf() {
        return Transf;
    }


    //metodo
    public void criarConta(){
        
        LerDados();
        boolean Vf1 = false;
        while(!Vf1){
            System.out.print("Digite o Nº da Agência que deseja: "); //FALTA LIMITE DE CARACTERERS
            this.nAgencia = tec.nextInt();
            String ag = Integer.toString(nAgencia);
            if (ag.length() == 5 && ag.matches("\\d{11}")) {
                Vf1 = true;
            } else {
                System.out.println("Agencia Invalida, TENTE NOVAMENTE!!");
            }
        }//ehile agencia
        
        
        boolean Vf2 = false;
       while(!Vf2){
           System.out.print("Digite o Nº da Conta:");
           this.nConta = tec.nextInt();
           Integer.toString(nConta);
           String ag = Integer.toString(nConta);
            if (ag.length() == 8 && ag.matches("\\d{11}")) {
                Vf2 = true;
            } else {
                System.out.println("Agencia Invalida, TENTE NOVAMENTE!!");
            }
        }///while conta
        
        System.out.println("CONTA CRIADA COM SUCESSO!!");
    }
     
    public void saldo(){
        System.out.println("SALDO");
        System.out.println("R$"+this.saldo);
    }
    public void deposito(){
        boolean vF = true;
        System.out.println("DEPÓSITO");
       while (vF == true) {
           System.out.println("Qual o valor que deseja depositar");
            this.deposito=tec.nextDouble();
            if(this.saldo>=this.deposito){
                this.saldo-= this.deposito;
                System.out.println("Deposito realizado!!");
                vF = false;
            } else{
                System.out.println("Saldo Insuficiente");
            }//if
        }//while
    }//deposito
       public void saque(){
        boolean vF = true;
        System.out.println("SAQUE");
       while (vF == true) {
           System.out.println("Qual o valor que deseja sacar");
            this.saque=tec.nextDouble();
            if(this.saldo>=this.saque){
                this.saldo-= this.saque;
                System.out.println("Saque realizado!!");
                vF = false;
            } else{
                System.out.println("Saldo Insuficiente");
            }//if
       }//while
    }//saque
       public void Transf(){
        boolean vF = true;
        System.out.println("Transferencia");
       while (vF == true) {
           System.out.println("Qual o valor que deseja Transferir"); 
            this.Transf=tec.nextDouble();
            if(this.saldo>=this.Transf){
                this.saldo-= this.Transf;
                System.out.println("Transferencia realizado!!");
                vF = false;
            } else{
                System.out.println("Saldo Insuficiente");
            }//if
       }//Saque

    }
}// class
