
package gerenciadores;

import classes.FilePersistence;
import classes.Musica;
import classes.SerializadorCSVMusica;
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
        for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getTitulo().equalsIgnoreCase(titulo)){
                musicas.remove(i);
                System.out.println("Música removida com sucesso!");
                return;
            }
        }
        System.out.println("Música não encontrada!");
    }

    public void buscarMusica(String titulo) {
        
        for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("A música " + musicas.get(i).getTitulo() + "existe!");
                return;
            }
        }
        System.out.println("Música: " + titulo + " não encontrada.");
    }

    public void salvarMusica(Musica musica) {
        for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getTitulo().equalsIgnoreCase(musica.getTitulo())){
                System.out.println("Essa música já existe!");
                return;
            }
        }
        musicas.add(musica);
        System.out.println("Música: " + musica.getTitulo() + " salva com sucesso!");
    }

    public void atualizarMusica(String tituloNovo, Musica musicaNova) {
        for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getTitulo().equalsIgnoreCase(tituloNovo)){
                musicas.set(i, musicaNova); //Substitui no mesmo índice
                System.out.println("Música: " + tituloNovo + " atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Música: " + tituloNovo + " não encontrada!");
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
        for(int i = 0; i < musicas.size(); i++){
            sb.append(musicas.get(i));
        }
        
        return sb.toString();
    }

		// Novo: Salva a lista um arquivo CSV
    public void salvarNoArquivo(String caminhoDoArquivo) {
        
        //Serializa a lista de musicas para String-csv
        SerializadorCSVMusica serializador = new SerializadorCSVMusica();
        String csvData = serializador.toCSV(musicas);
        
        //Gravar no arquivo usando o filePersistence
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Musicas salvas com sucesso em" + caminhoDoArquivo);
    }

    // Novo: Carrega a lista de objetos de um arquivo CSV
    public void loadDoArquivo(String caminhoDoArquivo) {
        
        //Carregar os dados do arquivo
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);
        
        //Desserializa para Lista de Produtos
        SerializadorCSVMusica serializador = new SerializadorCSVMusica();
        this.musicas = serializador.fromCSV(csvData);
        
        System.out.println("Musicas carregadas com sucesso de " + caminhoDoArquivo);
    }    
}
