package Seminar5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.
public class Task00 {
    public static void main(String[] args) {
//        Map<Integer, String> name = new HashMap<>();
//        Map<Integer, String> name = new LinkedHashMap<>();
        Map<Integer, String> name = new TreeMap<>();

        name.put(2013, "Тимур");
        name.put(1978, "Фоат");
        name.put(2015, "Эльвира");
        name.put(1976, "Пимпа");
        name.put(1952, "Владимир");
        name.put(1954, "Марина");
        name.put(1979, "Фоат");
        name.put(1980, "Фоат");
        name.put(1981, "Фоат");
        System.out.println(name);

        for (Map.Entry<Integer, String> entry : name.entrySet()) {
            if (entry.getValue().equals("Фоат")) {
                System.out.println("kay: " + entry.getKey() + ",  value: " + entry.getValue());
            }
        }
    }
}

