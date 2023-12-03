package Seminar1;

//Напишите программу, которая выведет на экран все
//простые числа в промежутке от 1 до 1000, каждое на новой строке.
// Например:
// 2
// 3
// 5
// 7
// 11
// ...

public class TaskDZ3 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++){
            boolean simpleNum = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    simpleNum = false;
                    break;
                }
            }
            if(simpleNum){
                System.out.println(i);
            }
        }
    }
}
