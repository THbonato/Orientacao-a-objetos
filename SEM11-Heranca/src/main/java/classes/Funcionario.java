package classes;

import java.util.Scanner;

public class Funcionario extends Pessoa{

    protected double salario;
    
    public Funcionario(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.salario = salario;
    }

    public Funcionario() {
        super();
        this.salario = 0.0;
    }
    
    public void imprimir(){
        System.out.println("_____Dados do Funcionário_____");
        super.imprimir();
        System.out.println("Salário: " + this.salario);
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        super.preencher();
        System.out.println("Salário: ");
        this.salario = ler.nextDouble();
    }
    protected double getBonificacao(){
        return this.salario * 0.10;
    }

    //Fazer get e set
}
