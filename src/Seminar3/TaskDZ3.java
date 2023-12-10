package Seminar3;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из
//этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TaskDZ3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] array){
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            arr.add(array[i]);
            sum = sum + array[i];
        }
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);
        System.out.println("Minimum is " + Collections.min(arr));
        System.out.println("Maximum is " + Collections.max(arr));
        System.out.println("Average is = " + sum /array.length);
    }
}
