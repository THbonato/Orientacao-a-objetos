package classes;

public class Engenheiro extends Funcionario{
  public Engenheiro(){
    super();
  }
  public Engenheiro(String nome, int idade, String cpf, double salario){
    super(nome, idade, cpf);//incluir salario
  }
  public double getBonificacao(){
    return this.salario * 0.12;
  }
}
