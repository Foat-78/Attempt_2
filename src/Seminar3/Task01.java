package Seminar3;
//���� ��������� ������, c������� �� � ������� == �
//������ equals() ������ Object
//String s1 = "hello";
//String s2 = "hello";
//String s3 = s1;
//String s4 = "h" + "e" + "l" + "l" + "o";
//String s5 = new String("hello");
//String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
public class Task01 {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        isEquals(s1, s2);
        System.out.println();
        isEquals(s1, s3);
        System.out.println();
        isEquals(s1, s4);
        System.out.println();
        isEquals(s1, s5);
        System.out.println();
        isEquals(s1, s6);
    }
    public static void isEquals(String str, String str1){

        if (str == str1){
            System.out.println("����� ��� ������!");
        } else if (str != str1){
            System.out.println("�� ����� ��� ������!");
        }
        if (str.equals(str1)) {
            System.out.println("����� ��� ��������!");
        } else if (!str.equals(str1)){
                System.out.println("�� ����� ��� ��������!");
        }
    }
}