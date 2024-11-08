package academy.devdojo.javacore.Qstrings.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para Strings: " + (fim - inicio) + "ms");

        System.out.println("-----------------------------------------");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para Strings Builders: " + (fim - inicio) + "ms");

        System.out.println("-----------------------------------------");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para Strings Buffer: " + (fim - inicio) + "ms");


    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < tamanho; i++){
            stringBuffer.append(i);
        }
    }

}
