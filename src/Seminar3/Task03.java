package Seminar3;

import java.util.ArrayList;
import java.util.List;

//������� ������ ���� ArrayList<String>.
//��������� � ���� ��� ������, ��� � ����� �����.
//������ �� ������, ����� � ������� ����� �����.
public class Task03 {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
        List list = new ArrayList<String>();
        list.add("������");
        list.add(8);
        list.add("������");
        list.add("������");
        list.add("�������");
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
