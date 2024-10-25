package main.AulaFacul.ProgramacaoWeb;

public class Atedentes extends Pessoa{
    private int numAtendimento;

    public Atedentes(int codPessoa, String nome, int numAtendimento){
        super(codPessoa,nome);
        this.numAtendimento = numAtendimento;
    }

    public int getNumAtendimento() {
        return numAtendimento;
    }

    public void setNumAtendimento(int numAtendimento) {
        this.numAtendimento = numAtendimento;
    }
}
