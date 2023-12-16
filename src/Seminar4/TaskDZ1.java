package Seminar4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
//“перевернутый” список.
// Пример:
// Дан:
//[1, One, 2, Two]
// Вывод:
//[1, One, 2, Two]
//[Two, 2, One, 1]

import java.util.LinkedList;
import java.util.Stack;
public class TaskDZ1 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        Stack<Object> st = new Stack<>();
        st.addAll(ll);
        LinkedList<Object> list = new LinkedList<>();
        for (int i = 0; i <= st.size() + 2; i++) {
            list.add(st.pop());
        }
        System.out.println(list);
    }
}