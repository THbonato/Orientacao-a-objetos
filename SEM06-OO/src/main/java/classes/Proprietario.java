
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Proprietario {
    private String nome;
    private String cpf;
    private String email;
    private List<Carro> listaCarros;
    
    public Proprietario(){
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.listaCarros = new ArrayList<>();
    }

    public Proprietario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.listaCarros = new ArrayList<>();
    }
    
    public void copiar(Proprietario outro){
        this.nome = outro.getNome();
        this.cpf = outro.getCpf();
        this.email = outro.getEmail();
        
        this.listaCarros = new ArrayList<>();
        for(Carro carro_i : outro.getListaCarros()){
            Carro novo = new Carro();
            novo.copiar(carro_i);
            this.listaCarros.add(novo);
        }
    }
    
    public void adicionarCarro(Carro carro){
        this.listaCarros.add(carro);
    }
    
    public boolean possuiCarroDeFabricante(String fabricante){
        for(Carro carro_i : listaCarros){
            if(carro_i.getFabricante().equalsIgnoreCase(fabricante)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________");
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("CPF: ").append(this.cpf).append("\n");
        sb.append("Email: ").append(this.email).append("\n");
        sb.append("_________________________");
        for(Carro carro_i : this.listaCarros){
            sb.append(carro_i.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.cpf);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.listaCarros);
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
        final Proprietario other = (Proprietario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.listaCarros, other.listaCarros);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(List<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }
    
    
}
