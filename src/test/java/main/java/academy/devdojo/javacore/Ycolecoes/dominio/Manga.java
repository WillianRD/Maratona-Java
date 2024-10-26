package main.java.academy.devdojo.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, Double preco) {
        Objects.requireNonNull(id, "ID não pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        Objects.requireNonNull(preco, "Preço não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    public void setId() {
        this.id = id;
    }

    public void setNome() {
        this.nome = nome;
    }

    public void setPreco() {
        this.preco = preco;
    }

    public Long getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
//        Negativo se o this < outroManga
//        se this == outroManga, return 0
//        positivo se this > outroManga
        if (this.id < outroManga.getID()){
            return -1;
        } else if (this.id.equals(outroManga.getID())){
            return 0;
        } else {
            return 1;
        }
//
//       return this.id.compareTo(outroManga.getID()); //Para organizar em ordem de ID
//        return Double.valueOf(preco).compareTo(outroManga.getPreco()); // Para organizar por ordem de preço crescente
//       return  this.nome.compareTo(outroManga.getNome()); // Para organizar os nomes em ordem Alfabética



    }
}
