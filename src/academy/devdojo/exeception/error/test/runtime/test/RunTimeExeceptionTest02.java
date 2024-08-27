package academy.devdojo.exeception.error.test.runtime.test;

public class RunTimeExeceptionTest02 {
    public static void main(String[] args) {
      divisao(1, 0);
    }

    public static int divisao(int a, int b) throws IllegalArgumentException {
        if(b == 0){
            throw  new IllegalArgumentException("Argumento Ilegal, não pode ser 0");
        }
        return a/b;
    }
}
