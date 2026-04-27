
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private int id;
    private List<Projeto> listaProjetos;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.listaProjetos = new ArrayList<>();
    }
    
    public Funcionario(){
        this.nome = "";
        this.id = 0;
        this.listaProjetos = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("ID: ").append(this.id).append("\n");
        for (Projeto projeto_i : listaProjetos) {
            sb.append(projeto_i.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void adicionarProjeto(Projeto projeto){
        this.listaProjetos.add(projeto);
    }
    
    public void removerProjeto(Projeto projeto){
        this.listaProjetos.remove(projeto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(List<Projeto> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nome);
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
        final Funcionario other = (Funcionario) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    
}
