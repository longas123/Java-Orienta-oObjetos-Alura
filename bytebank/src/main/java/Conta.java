public class Conta {
    private double saldo;
    private int agencia;
    private  int numero;
    private String titular;
    private static int totalContas;

    public Conta(int agencia, int numero){
        Conta.totalContas++;
        System.out.println("Total de contas:" + Conta.totalContas);
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor){
        this.saldo +=  valor;
    }

    public boolean sacar(double valor){
        boolean temSaldo = this.saldo >  valor;
        if(temSaldo){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("Não tem saldo suficiente");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
            return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public static int getTotalContas() {
        return Conta.totalContas;
    }
}
