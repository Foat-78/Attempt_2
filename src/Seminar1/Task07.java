package Seminar1;
//Записать в файл следующие данные:
//Name Surname Age
//Kate Smith 20
//Paul Green 25
//Mike Black 23

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task07 {
    public static void main(String[] args) throws IOException {
        File file = new File("Task07.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            String date = String.format("Name | Surname | Age\n" +
                                        "------------------\n" +
                                        "Kate |  Smith  | 20\n" +
                                        "Paul |  Green  | 25\n" +
                                        "Mike |  Black  | 23\n");
            fileWriter.write(date);
            fileWriter.flush();

        }
    }
}
