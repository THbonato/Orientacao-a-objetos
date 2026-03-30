package classes;

public class Produto {
    
    private String codigo;
    private String nome;
    private int quant_estoque;
    
    public Produto(){
        this.codigo = "";
        this.nome = "";
        this.quant_estoque = 0;
    }

    public Produto(String codigo, String nome, int quant_estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.quant_estoque = quant_estoque;
    }

    @Override
    public String toString() {
        return "Estoque: " + "Código: " + codigo 
                + " | Nome: " + nome 
                + " | Quantidade em Estoque: " + quant_estoque;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant_estoque() {
        return quant_estoque;
    }

    public void setQuant_estoque(int quant_estoque) {
        this.quant_estoque = quant_estoque;
    }
    
    
}
