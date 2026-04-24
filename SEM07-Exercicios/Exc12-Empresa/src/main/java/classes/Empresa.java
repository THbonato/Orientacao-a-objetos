
package classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome_empresa;
    private List<Projeto> listaProjetos;
    private List<Funcionario> listaFuncionarios;

    public Empresa() {
        this.nome_empresa = "";
        this.listaProjetos = new ArrayList<>();
        this.listaFuncionarios = new ArrayList<>();
    }
    
    public Empresa(String nome_empresa){
        this.nome_empresa = nome_empresa;
        this.listaProjetos = new ArrayList<>();
        this.listaFuncionarios = new ArrayList<>();
    }
    
    public void adicionarProjetos(Projeto projeto){
        this.listaProjetos.add(projeto);
    }
    
    public void removerProjetos(Projeto projeto){
        for(int i = 0; i <= this.listaProjetos.size(); i++){
            if(projeto.equals(i)){
                this.listaProjetos.remove(projeto);
            }
        }
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(List<Projeto> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    
    
}
