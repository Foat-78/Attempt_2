package Seminar1;
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class Task03 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,0,1,1,1,1,1,1,0,1,1,1,1};
        int count = 0;
        int max = 0;
        for (int i:array) {
            if (i == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else count = 0;
        }
        System.out.println(max);
    }
}
