package Seminar1;
//Напишите программу, который будет выполнять математические операции (+, -, *, /)
// над двумя числами и возвращать результат. В классе должен быть метод calculate,
// который принимает оператор и значения аргументов и возвращает результат вычислений.

import java.util.Scanner;

public class TaskDZ2 {
    public static void main(String[] args) {
        System.out.print("Введите число а: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        System.out.print("Введите число op: ");
        String op = scanner.next();
        double d = a;
        double z = b;

        switch (op){
            case "+" -> System.out.printf("%s + %s = %s", a, b, a + b);
            case "*" -> System.out.printf("%s * %s = %s", a, b, a * b);
            case "/" -> System.out.printf("%s / %s = %s", d, z, d / z);
            case "-" -> System.out.printf("%s - %s = %s", a, b, a - b);
            default -> System.out.println("Некорректный оператор");
        }
    }
}
