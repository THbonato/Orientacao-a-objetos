
package classes;

import java.util.ArrayList;
import java.util.List;

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
