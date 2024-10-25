package academy.devdojo.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class BancoDeDados implements Comparable<BancoDeDados>{
    private Long id;
    private String nome;
    private float salario;

    @Override
    public String toString() {
        return "BancoDeDados{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BancoDeDados that = (BancoDeDados) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, salario);
    }

    public BancoDeDados(Long id, String nome, float salario){
        Objects.requireNonNull(id,"Não pode estar vazio");
        Objects.requireNonNull(nome,"Precisa ter um nome");
        Objects.requireNonNull(salario, "Precisa de um salário");
        this.id = id;
        this.nome = nome;
        this.salario = salario;
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

    public float getSalario(){
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }


    @Override
    public int compareTo(BancoDeDados acessos) {
        return Float.valueOf(salario).compareTo(acessos.getSalario());
    }
}
