package Seminar1;
// Задание 2
// Написать программу, которая попросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Привет, %s!", name);
    }
}
