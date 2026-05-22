
package classes;

public class Cliente extends Pessoa{

    public Cliente(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public Cliente() {
        super();
    }
    
    public void imprimir(){
        super().imprimir();
    }
    public void preencher(){
        super().preencher();
    }
}
