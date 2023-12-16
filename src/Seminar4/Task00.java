package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
//Сравните с предыдущим.
public class Task00 {
    public static void main(String[] args) {
       char a = '+';
       int num = 10000000;

        arrayList(a, num);
        linkedList(a, num);
    }
    public static void arrayList(char symbol, int current){
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        Random rnd = new Random();
        long s = System.currentTimeMillis();
        for (int i = 0; i < current; i++) {
            list.add(symbol);
        }
        System.out.print(System.currentTimeMillis() - s + " = ArrayList\n");
        while (count != 1000){
            list.add(4000, (char) rnd.nextInt());
            count+=2;
        }
        System.out.print(System.currentTimeMillis() - s + " = Добавление элемента в ArrayList\n");
    }

    public static void linkedList(char symbol, int current){
        LinkedList<Character> list1 = new LinkedList<>();
        int count = 0;
        Random rnd = new Random();
        long s = System.currentTimeMillis();
        for (int i = 0; i < current; i++) {
            list1.add(symbol);
        }
        System.out.print(System.currentTimeMillis() - s + " = LinkedList\n");
        while (count != 1000){
            list1.add(4000, (char) rnd.nextInt());
            count+=2;
        }
        System.out.print(System.currentTimeMillis() - s + " = Добавление элемента в LinkedList\n");
    }
}
