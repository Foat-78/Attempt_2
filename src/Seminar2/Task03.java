package Seminar2;

import java.util.Arrays;
import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение)
public class Task03 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.toLowerCase().split("");
        String[] arr1 = new String[arr.length];
//        System.out.println(Arrays.toString(arr));
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
//        System.out.println(Arrays.toString(arr1));
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr1[i])){
                count++;
            }
        }
        System.out.printf("%s -> %s", str, count == arr.length - 1 ? "Является полиндромом" : "Не является полиндромом");
    }
}
