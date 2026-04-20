
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    
    public void adicionarRoda(Roda roda){
        this.listaRodas.add(roda);
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.fabricante);
        hash = 83 * hash + Objects.hashCode(this.modelo);
        hash = 83 * hash + Objects.hashCode(this.cor);
        hash = 83 * hash + Objects.hashCode(this.listaRodas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        return Objects.equals(this.listaRodas, other.listaRodas);
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
