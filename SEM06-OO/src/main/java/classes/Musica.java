
package classes;

public class Musica {
    private String titulo;
    private double duracao;
    
    public Musica(){
        this.titulo = "";
        this.duracao = 0.0;
    }

    public Musica(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________");
        sb.append("Título: ").append(this.titulo).append("\n");
        sb.append("Duração: ").append(this.duracao).append("\n");
        sb.append("_________________________");
        return sb.toString();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    
}
