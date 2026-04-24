
package classes;

import java.util.ArrayList;
import java.util.List;

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
    
    public void adicionarProjeto(){
    
    }
    
    public void removerProjeto(){
        
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
    
    
}
