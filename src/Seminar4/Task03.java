package Seminar4;

import java.util.Arrays;
import java.util.Stack;

//1) Написать метод, который принимает массив элементов, помещает их в стэк
//и выводит на консоль содержимое стэка.
//2) Написать метод, который принимает массив элементов, помещает их в
//очередь и выводит на консоль содержимое очереди.
public class Task03 {
    public static void main(String[] args) {
        int[] array = {45, 6, 8, 65, 98};
        System.out.println("Массив -> " + Arrays.toString(array));
        System.out.println("Стек -> " + stack(array));
    }

    public static Stack<Integer> stack(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stk.add(arr[i]);
        }
        return stk;
    }
}
