package main.AulaFacul.ProgramacaoWeb;

public class Tecnico extends Pessoa {
    private int numTecnico;

    public Tecnico(int codPessoa, String nome, int numTecnico){
        super(codPessoa, nome);
        this.numTecnico = numTecnico;
    }

    public int getNumTecnico() {
        return numTecnico;
    }

    public void setNumTecnico(int numTecnico) {
        this.numTecnico = numTecnico;
    }
}
