package Seminar1;
//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,2,3};
        int num = 3;
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == num){
                arr[array.length - i] = array[i];
            }else {
                arr[i] = array[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
