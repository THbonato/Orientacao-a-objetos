
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Projeto {
    private String nome_projeto;
    private int cod_projeto;
    private String descricao;
    private List<Funcionario> listaFuncionarios;

    public Projeto(String nome_projeto, int cod_projeto, String descricao) {
        this.nome_projeto = nome_projeto;
        this.cod_projeto = cod_projeto;
        this.descricao = descricao;
        this.listaFuncionarios = new ArrayList<>();
    }
    
    public Projeto(){
        this.nome_projeto = "";
        this.cod_projeto = 0;
        this.descricao = "";
        this.listaFuncionarios = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome_projeto).append(" | ");
        sb.append("Código: ").append(cod_projeto);
        sb.append("Descrição: ").append(descricao).append(" | ");
        sb.append("Funcionários: ");
        for(int i = 0; i < listaFuncionarios.size(); i++){
            sb.append(listaFuncionarios.get(i).getNome());
            if(i < listaFuncionarios.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        this.listaFuncionarios.add(funcionario);
    }
    
    public void removerFuncionario(Funcionario funcionario){
        this.listaFuncionarios.remove(funcionario);
    }

    public String getNome_projeto() {
        return nome_projeto;
    }

    public void setNome_projeto(String nome_projeto) {
        this.nome_projeto = nome_projeto;
    }

    public int getCod_projeto() {
        return cod_projeto;
    }

    public void setCod_projeto(int cod_projeto) {
        this.cod_projeto = cod_projeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nome_projeto);
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
        final Projeto other = (Projeto) obj;
        return Objects.equals(this.nome_projeto, other.nome_projeto);
    }
    
    
}
