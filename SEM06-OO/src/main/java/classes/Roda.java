
package classes;

public class Roda {
    private double raio;
    private String material;
    private String cor;

    public Roda(double raio, String material, String cor) {
        this.raio = raio;
        this.material = material;
        this.cor = cor;
    }
    
    public Roda(){
        this.raio = 0.0;
        this.material = "";
        this.cor = "";
    }
    
    public void copiar(Roda outra){
        this.raio = outra.getRaio();
        this.material = outra.getMaterial();
        this.cor = outra.getCor();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________");
        sb.append("Raio: ").append(this.raio).append("\n");
        sb.append("Material: ").append(this.material).append("\n");
        sb.append("Cor: ").append(this.cor).append("\n");
        sb.append("_________________________");
        return sb.toString();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
