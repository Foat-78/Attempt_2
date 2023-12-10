package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
//Сравните с предыдущим.
public class Task00 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        LinkedList<Character> list1 = new LinkedList<>();
        char a = '+';
        char b = '+';
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(a);
            System.out.println(list);
        }
        System.out.print(System.currentTimeMillis() - s + " <-> ");


//        long c = System.currentTimeMillis();
//        for (int j = 0; j < 10000; j++) {
//            list1.add(b);
//            System.out.println(list1);
//        }
//        System.out.println(System.currentTimeMillis() - c);
    }
}
