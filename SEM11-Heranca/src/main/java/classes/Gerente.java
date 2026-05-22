package classes;
public class Gerente extends Funcionario{
  
  private int senha;
  private int funcionarioGerenciados;
  
  public Gerente(){
    super();
    this.senha = 0;
    this.funcionariosGerenciados = 0;
  }
  public Gerente(String nome, int idade, String cpf, double salario, int senha, int funcionariosGerenciados){
    super(nome, idade, cpf, salario);
    this.senha = senha;
    this.funcionariosGerenciados = funcionariosGerenciados;
  }
  public double getBonificacao(){
    return this.salario * 0.15;
  }

  //Fazer getters e setters
}
