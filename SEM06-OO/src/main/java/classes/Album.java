
package classes;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private int ano;
    private List<Musica> listaMusicas;

    public Album(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
        this.listaMusicas = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________");
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("Ano: ").append(this.ano).append("\n");
        sb.append("_________________________");
        for(Musica musica_i : this.listaMusicas){
            sb.append(musica_i.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    public void adicionarMusica(Musica musica){
        this.listaMusicas.add(musica);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Musica> getListaMusicas() {
        return listaMusicas;
    }

    public void setListaMusicas(List<Musica> listaMusicas) {
        this.listaMusicas = listaMusicas;
    }
    
    
}
