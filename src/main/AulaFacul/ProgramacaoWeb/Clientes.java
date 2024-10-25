package main.AulaFacul.ProgramacaoWeb;

public class Clientes extends Pessoa{
    private String codPessoa;
    private int numCliente;

    public Clientes(int codPessoa, String nome, int numCliente){
        super(codPessoa, nome);
        this.numCliente = numCliente;
    }
    public void setCadastrar(){
        System.out.println("Cadastrando usuário");
    }

    public String getConsultar(){
        System.out.println("Consultando pessoa");
        return getConsultar();
    }

}
