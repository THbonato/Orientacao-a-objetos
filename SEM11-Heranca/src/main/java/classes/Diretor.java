package classes;

public class Diretor extends Funcionario{

  private String senha;
  
  public Diretor(){
    super();
    this.senha = "";
  }
  public Diretor(String nome, int idade, String cpf, double salario, String senha){
    super(nome, idade, cpf); // incluir salario
    this.senha = senha;
  }
  public double getBonificacao(){
    return this.salario * 0.20;
  }

  //Fazer get e set

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
  
    public String getSenha(String senha){
        return senha;
    }
    
    public void setSenha(){
        this.senha = senha;
    }
}
