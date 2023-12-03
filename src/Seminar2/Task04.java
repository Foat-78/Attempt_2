package Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Напишите метод, который составит строку, состоящую из 100
//повторений слова TEST и метод, который запишет эту строку в
//простой текстовый файл, обработайте исключения.
public class Task04 {
    public static void main(String[] args) throws IOException {
        int num = 100;
        String s = "Test\t";
        File file = new File("Task04.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (int i = 0; i <= num; i++) {
                String date = s;
                fileWriter.write(date);
                fileWriter.flush();
            }
        }
    }
}
