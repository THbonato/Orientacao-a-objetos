package classes;

public class Gerenciador {

    public static void exibirEmpresa(Empresa empresa) {
        System.out.println("=== Empresa ===");
        System.out.println("Nome: " + empresa.getNome_empresa());
        System.out.println("Total de projetos: " + empresa.getListaProjetos().size());
        System.out.println("Total de funcionários: " + empresa.getListaFuncionarios().size());
    }

    public static void adicionarProjetoEmpresa(Empresa empresa, Projeto projeto) {
        empresa.adicionarProjetos(projeto);
        System.out.println("Projeto '" + projeto.getNome_projeto() + "' adicionado à empresa.");
    }

    public static void removerProjetoEmpresa(Empresa empresa, Projeto projeto) {
        empresa.removerProjetos(projeto);
        System.out.println("Projeto '" + projeto.getNome_projeto() + "' removido da empresa.");
    }

    public static void listarProjetosEmpresa(Empresa empresa) {
        System.out.println("=== Projetos da empresa " + empresa.getNome_empresa() + " ===");
        if (empresa.getListaProjetos().isEmpty()) {
            System.out.println("Nenhum projeto cadastrado.");
            return;
        }
        for (Projeto p : empresa.getListaProjetos()) {
            System.out.println(p);
        }
    }

    public static void adicionarFuncionarioEmpresa(Empresa empresa, Funcionario funcionario) {
        empresa.adicionarFuncionario(funcionario);
        System.out.println("Funcionário '" + funcionario.getNome() + "' contratado na empresa.");
    }

    public static void removerFuncionarioEmpresa(Empresa empresa, Funcionario funcionario) {
        empresa.removerFuncionario(funcionario);
        System.out.println("Funcionário '" + funcionario.getNome() + "' removido da empresa.");
    }

    public static void listarFuncionariosEmpresa(Empresa empresa) {
        System.out.println("=== Funcionários da empresa " + empresa.getNome_empresa() + " ===");
        if (empresa.getListaFuncionarios().isEmpty()) {
            System.out.println("Nenhum funcionário contratado.");
            return;
        }
        for (Funcionario f : empresa.getListaFuncionarios()) {
            System.out.println(f);
        }
    }

    public static void alocarFuncionarioProjeto(Projeto projeto, Funcionario funcionario) {
        projeto.adicionarFuncionario(funcionario);
        funcionario.adicionarProjeto(projeto);
        System.out.println("Funcionário '" + funcionario.getNome()
                + "' alocado no projeto '" + projeto.getNome_projeto() + "'.");
    }

    public static void desalocarFuncionarioProjeto(Projeto projeto, Funcionario funcionario) {
        projeto.removerFuncionario(funcionario);
        funcionario.removerProjeto(projeto);
        System.out.println("Funcionário '" + funcionario.getNome()
                + "' removido do projeto '" + projeto.getNome_projeto() + "'.");
    }
    
    public static void exibirMaisProdutivo(Empresa empresa) {
        Funcionario f = empresa.funcionarioMaisProdutivo();
        if (f == null) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        System.out.println("Funcionário MAIS produtivo: " + f.getNome()
                + " (" + f.getListaProjetos().size() + " projeto(s))");
    }

    public static void exibirMenosProdutivo(Empresa empresa) {
        Funcionario f = empresa.funcionarioMenosProdutivo();
        if (f == null) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        System.out.println("Funcionário MENOS produtivo: " + f.getNome()
                + " (" + f.getListaProjetos().size() + " projeto(s))");
    }
}
