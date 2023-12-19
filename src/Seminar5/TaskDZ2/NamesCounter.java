package Seminar5.TaskDZ2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Вы работаете с приложением для учета имен пользователей.
//Ваша задача - разработать программу, которая принимает на вход пять имен пользователей
//(или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает,
//сколько раз каждое имя встречается.
//Программа должна использовать HashMap для хранения имен и их количества вхождений.
//По завершении, программа выводит результат в виде пар "имя - количество".
//
//На входе:
//'Elena'
//'Elena'
//'Elena'
//'Ivan'
//'Ivan'
//
//На выходе:
//{Ivan=2, Elena=3}
public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();
    // Метод для добавления имени в HashMap

    public void addName(String name) {
        // Введите свое решение ниже
        if (names.containsKey(name)) {
            int count = names.get(name);
            names.put(name, count + 1);
        } else {
            int count = 0;
            names.put(name, count + 1);
        }
//        int count = names.getOrDefault(name, 0);
//        count++;
//        names.put(name,count);
//        System.out.println(names);

    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        // Введите свое решение ниже
        System.out.println(names);
    }
}

