package Seminar3;

import java.util.ArrayList;
import java.util.List;

//������� ������� �������� �������� �������� � ���� ���������� ������
// List<ArrayList<String>> ���, ��� �� 0-� ������� ������� �����������
// ������ ���������� �������� �����, � �� ��������� �������� - �������� ����.
// �������� ����� ��� ���������� ������ ���������.
public class Task04 {
    static List<ArrayList<String>> shopBook = new ArrayList<>();
    public static void main(String[] args) {

        ArrayList<String> proza = new ArrayList<>();
        proza.add(0, "�����");
        proza.add("��������");

        ArrayList<String> poezia = new ArrayList<>();
        poezia.add(0, "������");
        poezia.add("������");

        addBooks(proza);
        addBooks(poezia);

        System.out.println(shopBook);
    }

        static void addBooks(ArrayList<String> books){
        shopBook.add(books);
        }
    }


