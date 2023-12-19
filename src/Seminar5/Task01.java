package Seminar5;

import java.util.HashMap;
import java.util.Map;

//���� 2 ������, �������� �����, ������� ������ true, ���� ��� ������ �������� ����������� � false, ���� ���.
// ������ ���������, ���� ���� ����� � ������ ����� ����� �������� �� ��������� ����� �� ������ �����, ��� ����
//������������� ����� ������ ����� �������� �� ���� � �� �� ����� �
// ����������� ������� ����������. (��������, add - egg ���������)
//����� ����� �� ��������, � �������� ����� ��. (��������, note - code)
//������ 1:
//Input: s = "foo", t = "bar"
//Output: false
//������ 2:
//Input: s = "paper", t = "title"
//Output: true
public class Task01 {
    public static void main(String[] args) {
        String st = "paper";
        String st1 = "title";
        System.out.println(isIsomorfe(st, st1));
    }

    public static boolean isIsomorfe(String str, String str1) {
        Map<Character, Character> isomorfe = new HashMap<>();
        if (str.length() != str1.length()) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (isomorfe.containsKey(str.charAt(i))) {
                    if (isomorfe.get(str.charAt(i)) != str1.charAt(i)) {
                        return false;
                    }
                } else {
                    if (isomorfe.containsValue(str1.charAt(i)) && !isomorfe.containsKey(str.charAt(i))) {
                        return false;
                    }
                    isomorfe.put(str.charAt(i), str1.charAt(i));
                }
            }
        }
        return true;
    }
}