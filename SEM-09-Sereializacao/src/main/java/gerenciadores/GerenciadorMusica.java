
package gerenciadores;

import classes.Musica;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorMusica {

    private List<Musica> musicas;

    public GerenciadorMusica() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
         musicas.add(musica);
    }

    public boolean removerMusica(String titulo) {
        musicas.remove(titulo);
        return true;
        //CONFERIR ESSE MÉTODO
    }

    public Musica buscarMusica(String titulo) {
        
        if(musicas.contains(titulo)){
            for (Musica musica : musicas) {
                if(musica.getTitulo().equals(titulo)){
                    return musica;
                }
            }
        }
        
        //REVISAR ESSE MÉTODO
    }

    public void salvarMusica(Musica musica) {
        /* faça o codigo */
    }

    public void atualizarMusica(String cpfAtual, Musica musicaNova) {
        /* faça o codigo */
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Música: ").append("\n");
       sb.append("Título: ");
       sb.append("Autor: ");
       sb.append("Duração: ");
       sb.append("Preço: ");
       return sb.toString();
       
       //ACABAR ESSE MÉTODO
    }

		// Novo: Salva a lista um arquivo CSV
    public void salvarNoArquivo(String caminhoDoArquivo) {
        /* faça o codigo */
    }

    // Novo: Carrega a lista de objetos de um arquivo CSV
    public void loadDoArquivo(String caminhoDoArquivo) {
        /* faça o codigo */
    }    
}
