package classes;

public class Diretor extends Funcionario{
  public Diretor(){
    super();
  }
  public Diretor(String nome, int idade, String cpf, double salario){
    super(nome, idade, cpf, salario);
  }
  public double getBonificacao(){
    return this.salario * 0.20;
  }
}
