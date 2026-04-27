package com.mycompany.exc12.empresa;

import classes.Empresa;
import classes.Funcionario;
import classes.Projeto;
import classes.Gerenciador;


public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("TechSolutions Ltda.");

        Funcionario ana   = new Funcionario("Ana Silva",   1);
        Funcionario bruno = new Funcionario("Bruno Costa", 2);
        Funcionario carla = new Funcionario("Carla Nunes", 3);
        Funcionario diego = new Funcionario("Diego Ramos", 4);

        Projeto p1 = new Projeto("Portal do Cliente",  1, "Portal web para clientes.");
        Projeto p2 = new Projeto("App Mobile",         2, "Aplicativo Android e iOS.");
        Projeto p3 = new Projeto("Integração de APIs", 3, "Integração com parceiros via REST.");
        Projeto p4 = new Projeto("Relatórios BI",      4, "Dashboards de inteligência de negócios.");

        System.out.println("======= CONTRATANDO FUNCIONÁRIOS =======");
        Gerenciador.adicionarFuncionarioEmpresa(empresa, ana);
        Gerenciador.adicionarFuncionarioEmpresa(empresa, bruno);
        Gerenciador.adicionarFuncionarioEmpresa(empresa, carla);
        Gerenciador.adicionarFuncionarioEmpresa(empresa, diego);

        System.out.println("\n======= CADASTRANDO PROJETOS =======");
        Gerenciador.adicionarProjetoEmpresa(empresa, p1);
        Gerenciador.adicionarProjetoEmpresa(empresa, p2);
        Gerenciador.adicionarProjetoEmpresa(empresa, p3);
        Gerenciador.adicionarProjetoEmpresa(empresa, p4);

        System.out.println("\n======= ALOCANDO FUNCIONÁRIOS EM PROJETOS =======");
        Gerenciador.alocarFuncionarioProjeto(p1, ana);
        Gerenciador.alocarFuncionarioProjeto(p2, ana);
        Gerenciador.alocarFuncionarioProjeto(p3, ana);

        Gerenciador.alocarFuncionarioProjeto(p1, bruno);
        Gerenciador.alocarFuncionarioProjeto(p4, bruno);

        Gerenciador.alocarFuncionarioProjeto(p2, carla);

        System.out.println("\n======= VISÃO GERAL DA EMPRESA =======");
        Gerenciador.exibirEmpresa(empresa);

        System.out.println("\n======= LISTA DE FUNCIONÁRIOS =======");
        Gerenciador.listarFuncionariosEmpresa(empresa);

        System.out.println("\n======= LISTA DE PROJETOS =======");
        Gerenciador.listarProjetosEmpresa(empresa);

        System.out.println("\n======= PRODUTIVIDADE =======");
        Gerenciador.exibirMaisProdutivo(empresa);
        Gerenciador.exibirMenosProdutivo(empresa);

        System.out.println("\n======= REMOÇÕES =======");
        Gerenciador.desalocarFuncionarioProjeto(p2, ana);
        Gerenciador.removerProjetoEmpresa(empresa, p4);
        Gerenciador.removerFuncionarioEmpresa(empresa, diego);

        System.out.println("\n======= ESTADO FINAL =======");
        Gerenciador.exibirEmpresa(empresa);

        System.out.println("\n======= PRODUTIVIDADE FINAL =======");
        Gerenciador.exibirMaisProdutivo(empresa);
        Gerenciador.exibirMenosProdutivo(empresa);
    }
}