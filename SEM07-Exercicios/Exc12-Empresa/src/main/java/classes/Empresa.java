
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
        this.listaProjetos.remove(projeto);
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        this.listaFuncionarios.add(funcionario);
    }
    
    public void removerFuncionario(Funcionario funcionario){
        this.listaFuncionarios.remove(funcionario);
    }
    
    public void listarProjetos(){
        for(Projeto p : this.listaProjetos){
            System.out.println(p);
        }
    }

    public void listarFuncionarios(){
        for(Funcionario f : this.listaFuncionarios){
            System.out.println(f);
        }
    }
    

    public Funcionario funcionarioMaisProdutivo(){
        if(listaFuncionarios.isEmpty()) return null;

        Funcionario maisProdutivo = listaFuncionarios.get(0);
        for(Funcionario f : listaFuncionarios){
            if(f.getListaProjetos().size() > maisProdutivo.getListaProjetos().size()){
                maisProdutivo = f;
            }
        }
        return maisProdutivo;
    }

    public Funcionario funcionarioMenosProdutivo(){
        if(listaFuncionarios.isEmpty()) return null;

        Funcionario menosProdutivo = listaFuncionarios.get(0);
        for(Funcionario f : listaFuncionarios){
            if(f.getListaProjetos().size() < menosProdutivo.getListaProjetos().size()){
                menosProdutivo = f;
            }
        }
        return menosProdutivo;
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
