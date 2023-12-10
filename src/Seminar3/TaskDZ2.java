package Seminar3;

import java.util.ArrayList;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class TaskDZ2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        remuvEvenNumbers(arr);
    }
    public static void remuvEvenNumbers(Integer[] array){
        ArrayList<Integer> evenNum = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                evenNum.add(array[i]);
            }
        }
        System.out.println(evenNum);
    }
}
