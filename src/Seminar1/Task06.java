package Seminar1;

// Реализовать функцию возведения числа а в степень b. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        System.out.print("Введите число а: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Введите число b: ");
        int n = scanner.nextInt();

        double p = n < 0 ? 1.0 / x : x;
        int m = n < 0 ? -n : n;
        double res = 1.0;
        while (m-- > 0) {
            res *= p;
        }
        System.out.println(res);
    }
}
