package Seminar2;
// Дано четное число N (>0) и символы c1 и c2, которое следует учитывать как 1 символ
// Написать метод, который вернет строку длины N * 2, которая
// состоит из чередующихся последовательностей c1 и c2, начиная с c1.
public class Task01_1 {
    public static void main(String[] args) {
        String c1 = "c1";
        String c2 = "c2";
        int n = 10;
        System.out.println(repeat(n, c1, c2));
    }
    public static String repeat(int n, String c1, String c2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                result.append(c1);
            else
                result.append(c2);
        }
            System.out.println(result.length());
            return result.toString();
    }
}
