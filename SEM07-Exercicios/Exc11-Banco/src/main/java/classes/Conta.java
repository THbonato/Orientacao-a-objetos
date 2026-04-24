
package classes;

public class Conta {
    private int num_conta;
    private String titular;
    private double saldo_atual;

    public Conta() {
        this.num_conta = 0;
        this.titular = "";
        this.saldo_atual = 0.0;
    }

    public Conta(int num_conta, String titular, double saldo_atual) {
        this.num_conta = num_conta;
        this.titular = titular;
        this.saldo_atual = saldo_atual;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Número da Conta: ").append(this.num_conta).append("\n");
        sb.append("Titular da Conta: ").append(this.titular).append("\n");
        sb.append("Saldo Atual: ").append(this.saldo_atual).append("\n");
        
        return sb.toString();
    }
    
    public double depositar(){
        return 0;
    }
    
    public double sacar(){
        return 0;
    }
    
    public double atualizarSaldo(){
        return 0;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(double saldo_atual) {
        this.saldo_atual = saldo_atual;
    }  
}
