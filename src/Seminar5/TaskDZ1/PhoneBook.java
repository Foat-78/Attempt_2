package Seminar5.TaskDZ1;

//�������� ���������, �������������� ���������� �����. ��������� ������ ����� ��������� �������:
//add(String name, Integer phoneNum): ��������� ������ � ���������� �����.
//���� ������ � ������ name ��� ����������, ��������� ����� ����� �������� � ������������ ������.
//���� ������ � ������ name �� ����������, ������� ����� ������ � ���� ������ � ������� �������� phoneNum.
//find(String name): ����� ������� �������� �� ����� � ���������� �����.
//���� ������ � ������ name ����������, ���������� ������ ������� �������� ��� ���� ������.
//���� ������ � ������ name �� ����������, ���������� ������ ������.
//getPhoneBook(): ���������� ��� ���������� ����� � ���� HashMap, ��� ����� - ��� �����, � �������� - ������ ������� ��������.

//�� �����:
//add("Alice", 123456);
//add("Alice", 789012);
//add("Bob", 789012);

//�� ������:
//�������:
//find("Alice")
//getPhoneBook()
//find("Me")

//���������:
//
//[123456, 789012].
//{Bob=[789012], Alice=[123456, 789012]}
//[]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PhoneBook {
    public static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public void add(String name, Integer phoneNum) {
      phoneBook.putIfAbsent(name,new ArrayList<>());
      phoneBook.get(name).add(phoneNum);
    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name)) {
                result = entry.getValue();
            }
        }
        return result;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}


