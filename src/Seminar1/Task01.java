package Seminar1;
// Задание 1
//Настроить проект, вывести в консоль “Hello world!”.
//Вывести в консоль системные дату и время.



import java.time.LocalDateTime;
import java.util.Date;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        // Первый вариант
        System.out.println(new Date());
        // Второй вариант
        System.out.println(LocalDateTime.now());
    }
}
