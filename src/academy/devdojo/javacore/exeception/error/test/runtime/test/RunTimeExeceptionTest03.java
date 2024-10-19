package academy.devdojo.javacore.exeception.error.test.runtime.test;

public class RunTimeExeceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }

    public static String abreConexao2() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}