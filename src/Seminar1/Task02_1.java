package Seminar1;
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59


import java.time.LocalTime;
import java.util.Scanner;

public class Task02_1 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59))) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(17,59))) {
            System.out.printf("Добрый день, %s!", name);
        } else if (now.isAfter(LocalTime.of(18,0)) && now.isBefore(LocalTime.of(22,59))) {
                System.out.printf("Добрый вечер, %s!", name);
        } else if (now.isAfter(LocalTime.of(23,0)) && now.isBefore(LocalTime.of(4,59))) {
            System.out.printf("Доброй ночи, %s!", name);
        }
    }
}
