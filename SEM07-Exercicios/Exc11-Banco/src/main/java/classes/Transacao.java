
package classes;

import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private int id_transacao;
    private String tipo_transacao;
    private double valor;
    private String data;
    private List<Conta> listaContas;

    public Transacao(int id_transacao, String tipo_transacao, double valor, String data) {
        this.id_transacao = id_transacao;
        this.tipo_transacao = tipo_transacao;
        this.valor = valor;
        this.data = data;
        this.listaContas = new ArrayList<>();
    }
    
    public Transacao() {
        this.id_transacao = 0;
        this.tipo_transacao = "";
        this.valor = 0.0;
        this.data = "";
        this.listaContas = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Identificador da Transação: ").append(this.id_transacao).append("\n");
        sb.append("Tipo de Transação: ").append(this.tipo_transacao).append("\n");
        sb.append("Valor: ").append(this.valor).append("\n");
        sb.append("Data: ").append(this.data).append("\n");
        
        return sb.toString();
    }

    public int getId_transacao() {
        return id_transacao;
    }

    public void setId_transacao(int id_transacao) {
        this.id_transacao = id_transacao;
    }

    public String getTipo_transacao() {
        return tipo_transacao;
    }

    public void setTipo_transacao(String tipo_transacao) {
        this.tipo_transacao = tipo_transacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }
    
    
}
