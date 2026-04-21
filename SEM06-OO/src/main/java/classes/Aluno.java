
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private String curso;
    private List<Telefone> listaTelefone;

    public Aluno(String nome, String matricula, String email, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.curso = curso;
        this.listaTelefone = new ArrayList<>();
    }
    
    public Aluno(){
        this.nome = "";
        this.matricula = "";
        this.email = "";
        this.curso = "";
        this.listaTelefone = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("_________________");
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("Matrícula: ").append(this.matricula).append("\n");
        sb.append("Email: ").append(this.email).append("\n");
        sb.append("Curso: ").append(this.curso).append("\n");
        for(Telefone telefone_i : this.listaTelefone){
            sb.append(telefone_i.toString()).append("\n");
        }
        sb.append("__________________");
        return sb.toString();
    }
    
    public void copiar(){
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.matricula);
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.curso);
        hash = 59 * hash + Objects.hashCode(this.listaTelefone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        return Objects.equals(this.listaTelefone, other.listaTelefone);
    }
    
    

    public List<Telefone> getListaTelefone() {
        return listaTelefone;
    }

    public void setListaTelefone(List<Telefone> listaTelefone) {
        this.listaTelefone = listaTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
