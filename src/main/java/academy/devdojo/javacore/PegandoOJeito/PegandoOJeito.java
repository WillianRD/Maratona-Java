package academy.devdojo.javacore.PegandoOJeito;

public class PegandoOJeito {
    private String usuarioAdministrador = "Will";
    private String nomeUser;
    private int idadeUser;

    public static void main(String[] args) {
        PegandoOJeito pessoa = new PegandoOJeito();
        pessoa.nomeUser();
        pessoa.idade();
    }

    public void nomeUser() {
        this.nomeUser = "Wil";
        if (nomeUser.equals(usuarioAdministrador)) {
            System.out.println("Seja bem vindo Administrador " + usuarioAdministrador);
        } else {
            throw new IllegalArgumentException("Parece que tentou fazer login em uma conta que não é sua!" + "\n" + "Enviando tentativa de acesso para o Administrador");
        }
    }

    public void idade() {
        this.idadeUser = 19;
        if (idadeUser >= 18) {
            System.out.println("Acesso Liberado");
        } else {
            throw new IllegalArgumentException(new IllegalArgumentException("Acesso negado, devido a idade"));
        }
    }
}



