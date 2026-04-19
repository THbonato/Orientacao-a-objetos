
package classes;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private List<Roda> listaRodas;
    
    public Carro(){
        this.fabricante = "";
        this.modelo = "";
        this.cor = "";
        this.listaRodas = new ArrayList<>();
    }

    public Carro(String fabricante, String modelo, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.listaRodas = new ArrayList<>();
    }
    
    public void copiar(Carro outro){
        this.fabricante = outro.getFabricante();
        this.modelo = outro.getModelo();
        this.cor = outro.getCor();
        
        this.listaRodas = new ArrayList<>();
        for(Roda roda_i : outro.getListaRodas()){
            Roda nova = new Roda();
            nova.copiar(roda_i);
            this.listaRodas.add(nova);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________");
        sb.append("Fabricante: ").append(this.fabricante).append("\n");
        sb.append("Modelo: ").append(this.modelo).append("\n");
        sb.append("Cor: ").append(this.cor).append("\n");
        sb.append("_________________________");
        for(Roda roda_i : this.listaRodas){
            sb.append(roda_i.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Roda> getListaRodas() {
        return listaRodas;
    }

    public void setListaRodas(List<Roda> listaRodas) {
        this.listaRodas = listaRodas;
    }
}
