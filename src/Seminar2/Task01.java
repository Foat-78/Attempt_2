package Seminar2;

import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.
public class Task01 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String str = "c1";
        String str1 = "c2";
        for (int i = 0; i < number; i++) {
                System.out.print(str + str1);
        }
    }
}
