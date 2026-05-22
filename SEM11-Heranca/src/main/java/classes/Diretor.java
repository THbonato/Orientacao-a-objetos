package classes;

public class Diretor extends Funcionario{

  private String senha;
  
  public Diretor(){
    super();
    this.senha = 0;
  }
  public Diretor(String nome, int idade, String cpf, double salario, String senha){
    super(nome, idade, cpf, salario);
    this.senha = senha;
  }
  public double getBonificacao(){
    return this.salario * 0.20;
  }

  //Fazer get e set
}
