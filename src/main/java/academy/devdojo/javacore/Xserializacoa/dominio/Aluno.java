package academy.devdojo.javacore.Xserializacoa.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private String passworld;

    public Aluno(Long id, String nome, String passworld){
        this.id = id;
        this.nome = nome;
        this.passworld = passworld;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passworld='" + passworld + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }
}
