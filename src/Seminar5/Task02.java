package Seminar5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//Пример 1: a+(d*3) - истина
//Пример 2: [a+(1*3) - ложь
//Пример 3: [6+(3*3)] - истина
//Пример 4: {a}[+]{(d*3)} - истина
//Пример 5: <{a}+{(d*3)}> - истина
//Пример 6: {a+]}{(d*3)} - ложь
public class Task02 {
    static Map<Character, Character> openCloseBrackets = Map.of('{', '}', '[', ']', '(', ')', '<', '>');

    public static void main(String[] args) {
        String s1 = "a+(d*3)";
        String s2 = "[a+(1*3)";
        String s3 = "[6+(3*3)]";
        String s4 = "{a}[+]{(d*3)}";
        String s5 = "<{a}+{(d*3)}>";
        String s6 = "{a+]}{(d*3)}";
        System.out.println(valid(s1) + " = истина");
        System.out.println(valid(s2) + " = ложь");
        System.out.println(valid(s3) + " = истина");
        System.out.println(valid(s4) + " = истина");
        System.out.println(valid(s5) + " = истина");
        System.out.println(valid(s6) + " = ложь");
    }

    public static boolean valid(String massege) {
        Deque<Character> openBrackets = new ArrayDeque<>();
        for (Character symbole : massege.toCharArray()) {
            if (openCloseBrackets.containsKey(symbole)) {
                openBrackets.add(symbole);
            } else if (openCloseBrackets.containsValue(symbole)) {
                if (openBrackets.isEmpty()) {
                    return false;
                }
                char top = openBrackets.removeLast();
                if (openCloseBrackets.get(top) != symbole) {
                    return false;
                }
            }
        }
        return openBrackets.isEmpty();
    }
}

