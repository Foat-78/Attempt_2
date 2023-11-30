package Seminar1;
//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

import java.util.Arrays;
public class Task05 {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String[] arrays = s.split(" ");
        System.out.println(Arrays.toString(arrays));
        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.print(arrays[i] + " ");
        }
    }
}
