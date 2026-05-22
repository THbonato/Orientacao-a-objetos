package classes;
public class Gerente extends Funcionario{
  public Gerente(){
    super();
  }
  public Gerente(String nome, int idade, String cpf, double salario){
    super(nome, idade, cpf, salario);
  }
  public double getBonificacao(){
    return this.salario * 0.15;
  }
}
