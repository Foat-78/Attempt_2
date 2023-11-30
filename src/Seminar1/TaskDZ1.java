package Seminar1;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Пример:
//        n = 4 -> 10
//        n = 5 -> 15
public class TaskDZ1 {
    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 0; i <= n; i++) {
           s = i + s;
        }
        System.out.printf("n = %d -> %d", n, s);
    }
}
