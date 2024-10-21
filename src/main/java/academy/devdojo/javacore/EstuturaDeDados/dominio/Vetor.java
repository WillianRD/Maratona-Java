package academy.devdojo.javacore.EstuturaDeDados.dominio;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    //    Método para adicionar
    public void adicionar(String elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (this.elementos[i] == null) ;
            this.elementos[i] = elemento;
            break;
        }
    }

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //    Método para adicionar
    public boolean adicionarElemento(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "Vetores: " +
                "Nomes = " + Arrays.toString(elementos) + "\n" +
                " Tamanho do Array=" + tamanho;
    }
}

