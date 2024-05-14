package academy.devdojo;

public class Aula08ArraaysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];  //{1,2};
        arrayInt[1] = new int[3]; //{1,2,3};
        arrayInt[2] = new int[6 ]; //{1,2,3,4,5,6};

        int [][] araryInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n---------------------------------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");

            }
        }
    }
}