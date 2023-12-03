package Seminar1;
//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,3,1,3,4,5,9,10,3,3,12,15,111};
        int[] array1 = new int [array.length];
        int num = 3;
        int j = 0;
        System.out.printf("%s -> ", Arrays.toString(array) );
        for (int i = 0; i < array.length; i++) {
            if (array[i] != num ){
                array1[j] = array[i];
                j++;
            }
            for (int k = 0; k < array1.length; k++) {
                if (array1[k] == 0){
                    array1[k] = num;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
