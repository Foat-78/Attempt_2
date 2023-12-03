package Seminar1;
// Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.print("Введите число а: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
//        System.out.println(a + " " + b);
        for (int i = 0; i < b; i++) {
            a *= a;
        }
        System.out.println(a);
    }
}
