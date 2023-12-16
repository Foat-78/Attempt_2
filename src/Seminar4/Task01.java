package Seminar4;

import java.util.*;

//Реализовать консольное приложение, которое:
//1. Принимает от пользователя строку вида text:num
//2. Нужно рассплитить строку по :, сохранить text в связный список на
//позицию num.
//3. Если введено print:num, выводит строку из позиции num в связном
//списке и удаляет её из списка.
public class Task01 {
    static List<String> dataList = new LinkedList<>();

    public static void main(String[] args) {
        while (true) {
            if (run().equals("q")) {
                System.exit(0);
            }
            run();
        }
    }

    public static String prompt() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static void warning(int ind) {
        for (int i = 0; i < ind; i++) {
            dataList.add(null);
        }
    }

    public static String run() {
        System.out.print("Введите данные: ");
        String inMess = prompt();
        String[] spl = inMess.split(":");
        String word = spl[0];
        int index = Integer.parseInt(spl[1]);
        if (index > dataList.size()) {
            warning(index);
        }
        if (word.equals("print") && dataList.get(index) != null) {
            System.out.println(dataList.get(index));
            dataList.remove(index);
        } else {
            dataList.add(index, word);
        }
        return inMess;
    }
}
