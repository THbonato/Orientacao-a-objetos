
package classes;

import java.util.ArrayList;
import java.util.List;


public class SerializadorCSVMusica {
    
    //Serializa = Salvar no formato texto
    
    public String toCSV(List<Musica> musicas){
        String csv = "Titulo;Autor;Duracao;Preco;\n";
        for (Musica musica : musicas) {
            csv += musica.getTitulo() + ";"
                + musica.getArtista() + ";"
                + musica.getDuracao() + ";"
                + musica.getPreco() + ";\n";
        }
        return csv;
    }
    
    //Deserializa uma String no formato CSV para uma lista de Musicas
    
    public List<Musica> fromCSV(String data){
        List<Musica> musicas = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        //Ignora o cabeçalho
        
        for(int i = 0; i < linhas[i].length(); i++){
            String[] partes = linhas[i].split(";");
            if(partes.length >= 4){
                Musica musica = new Musica();
                musica.setTitulo(partes[0]);
                musica.setArtista(partes[1]);
                musica.setDuracao(Double.parseDouble(partes[2]));
                musica.setPreco(Double.parseDouble(partes[3]));
                
                //Após montar um produto, adiciono na lista
                musicas.add(musica);
            }
        }
        return musicas;
    }
}
