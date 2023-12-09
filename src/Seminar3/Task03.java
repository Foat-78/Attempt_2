package Seminar3;

import java.util.ArrayList;
import java.util.List;

//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.
public class Task03 {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
        List list = new ArrayList<String>();
        list.add("Привет");
        list.add(8);
        list.add("восьми");
        list.add("летняя");
        list.add("Эльвира");
        list.add(5);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
            }
//            builder.append(list);
        }
        System.out.println(list);
    }
}
