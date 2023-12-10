package Seminar3;

import java.util.Arrays;

//Реализовать алгоритм сортировки слиянием
// Пример вывода: a = {5, 1, 6, 2, 3, 4, 7} -> [1, 2, 3, 4, 5, 6, 7]
public class TaskDZ1 {
    public static void main(String[] args) {
        int[] a = new int[]{5, 1, 6, 2, 3, 4, 7};
        System.out.print("a = " + Arrays.toString(a).replace("[", "{").replace("]", "}") + " -> ");
        mergeSort(a);
        System.out.print(Arrays.toString(a));
    }

    private static void mergeSort(int[] a) {

        // Делим массив на пополам и заполняем массив нулями для l и r
        int lenDiv = a.length;
        if (lenDiv == 1) {
            return;
        }

        int mid = lenDiv / 2;
        int[] l = new int[mid];
        int[] r = new int[lenDiv - mid];

        // Заполняем два подмассива значениями массива
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int j = mid; j < lenDiv; j++) {
            r[j - mid] = a[j];
        }
        mergeSort(l);
        mergeSort(r);
        merg(a, l, r);
    }

    public static void merg(int[] a, int[] l, int[] r) {
        int lLeft = l.length;
        int rLeft = r.length;
        int j = 0;
        int i = 0;
        int index = 0;
        while (i < lLeft && j < rLeft){
            if (l[i] < r[j]){
                a[index] = l[i];
                i++;
            }else {
                a[index] = r[j];
                j++;
            }index++;
        }
        for (int k = i; k < lLeft; k++) {
            a[index++] = l[k];
        }
        for (int c = j; c < rLeft; c++) {
            a[index++] = r[c];
        }
    }
}
