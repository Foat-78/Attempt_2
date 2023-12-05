package Seminar2;
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение)
// Например: А роза упала на лапу Азора
public class Task03_1 {
    public static void main(String[] args) {
        System.out.println(polindrome("А роза упала на лапу Азора"));
    }
    public static boolean polindrome(String str){
        StringBuilder stB = new StringBuilder(str);
        if (stB.reverse().toString().equals(str)){
            return true;
        }
        else {
            return false;
        }
    }
}
