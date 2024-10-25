package main.AulaFacul.ProgramacaoWeb;

public class Pessoa {
    private int codigoPessoa;
    private String pessoa;

    public Pessoa(int codigoPessoa, String pessoa){
        this.codigoPessoa = codigoPessoa;
        this.pessoa = pessoa;
    }

    public int getCodigoPessoa(int codigoPessoa){
        return codigoPessoa;
    }

    public void setCodigoPessoa(){
        this.codigoPessoa = codigoPessoa;
    }

    public String getPessoa(){
        return pessoa;
    }

    public void setPessoa(){
        this.pessoa = pessoa;
    }
}
