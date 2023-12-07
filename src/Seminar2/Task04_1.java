package Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Напишите метод, который составит строку, состоящую из 100
//повторений слова TEST и метод, который запишет эту строку в
//простой текстовый файл, обработайте исключения.
public class Task04_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("Task04_1.jason"); // Создаём новый файл и вместо аргумента указываем относительный или полный путь к файлу
        FileWriter fileWriter = new FileWriter(file); // Для записи в файл необходимо создат  новый объект FileWriter
        fileWriter.write(String.valueOf(repeat("TEST ")));
        fileWriter.flush();

    }
    public static StringBuilder repeat(String str){
        StringBuilder stB = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stB.append(str);
        }
        return stB;
    }

}
