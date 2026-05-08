
package gerenciadores;

import classes.Musica;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorMusica {

    private List<Musica> musicas;

    public GerenciadorMusica() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica Novamusica) {
        if(musicas.contains(Novamusica)){
            System.out.println("Essa música já existe!");
        }else{
            musicas.add(Novamusica);
        }
    }

    public void removerMusica(String titulo) {
        if(!musicas.contains(titulo)){
            System.out.println("Essa música não existe!");
        }else{
            musicas.remove(titulo);
        }
    }

    public void buscarMusica(String titulo) {
        
        for(int i = 0; i <= musicas.size(); i++){
            if(musicas.get(i).getTitulo() == titulo){
                System.out.println("A música " + musicas.get(i).getTitulo() + "existe!");
            }
        }
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
        for(int i = 0; i <= musicas.size(); i++){
            sb.append(musicas.get(i));
        }
        
        return sb.toString();
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
