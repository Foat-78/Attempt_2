package Seminar3;
//��������� ������ ������� ���������� �������.
//������������� ������ ������� sort() � ������� ��� ��
//�����

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task01_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rn = new Random();
        sort(list, rn);
    }

    public static void sort(ArrayList lst, Random rnd){
        for (int i = 0; i < 10; i++) {
            lst.add(rnd.nextInt(1,10));
        }
        System.out.print(lst);
        lst.sort(Comparator.naturalOrder());
        System.out.println(" -> ��������������� �� ����������: " + lst);
//        lst.sort(Comparator.reverseOrder());
//        System.out.println(" -> ��������������� �� ����������: " + lst);
    }
}
