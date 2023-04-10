package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단 이중반복문
        // 2 * 1 = 2
        // 2 * 2 = 4

        for (int i = 2; i <= 9; i++) { // or i < 10 : 구구단이니까
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));

            }
            System.out.println();
/*
            int j = 1;
            System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 1 = 2
            j++;
            System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 2 = 4
            j++;
            System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 3 = 6
*/
        }
    }
}
