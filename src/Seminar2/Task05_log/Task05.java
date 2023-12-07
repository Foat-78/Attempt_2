package Seminar2.Task05_log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

//1. Напишите метод, который вернет содержимое текущей папки в виде
//массива строк.
//2. Напишите метод, который запишет массив, возвращенный предыдущим
//методом в файл.
//3. Обработайте ошибки с помощью try-catch конструкции. В случае
//возникновения исключения, оно должно записаться в лог-файл.
public class Task05 {
    private final static String PATH = ".";


    // Переменная LOG которая отвечает за логер.
    // log(Task05.class.getName()) - такой способ передачи в метод является более рекомендуемой
    // т.к. при замене названия класса Task05 метод у нас не поломается.
    // Можно использовать так: log(Task05) - но не рекомендуется
    private static final Logger LOG = log.log(Task05.class.getName());
    public static void main(String[] args) {

//        getFileNamesInDir(); // Нам распечатает какие у нас в текущей директории, директории нашего проекта есть файлы и папки
        System.out.println(Arrays.toString(getFileNamesInDir()));
        write();
    }
    private static void write() {
        try (FileWriter in = new FileWriter("Task05.txt", true)) {
            String[] data = getFileNamesInDir();
            for (String s: data) {
                in.append(s).append("\n");
            }
            System.out.println("File names in goal dir recorded!!!");
            if (isThrow()){ // Генерация исключении через метод isThrow()
                throw new IOException("Some kind of mistake");
            }
        } catch (IOException e) {
           LOG.log(Level.INFO, e.getLocalizedMessage());
           e.printStackTrace();
        }
    }
    /*
    Вспомогательный метод isThrow который отображает ошибки т.е провоцирует исключение.
    Метод возвращает тип boolean и внутри имеет переменные типа int a и b.
    В int digit кладём значение - а и плюс рандомные число умноженное на b и
    возвращаем число digit в случае больше 0. isThrow иногда вернёт 1 или 2 и это
    будет ошибка, а когда 0 то ничего не вернёт.
     */
    private static boolean isThrow(){
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }

    /*
    По пункту 1 задания.
    Есть метод getFileNamesInDir() который возвращает массив строк и вычитывает из нашей
    текущей папки все названия файлов.
    Папка File dir равно new File(PATH) или можно просто записать так File(".") где точка обозначает
    текущая папка.
    Доводим переменную String[] result которая пока длиной будет равен нулю. Далее заводим массив файлов
    File[] files и просто он ен инициализирован.
    Далее если dir - это директория то мы File массивов под названием files инициализируем
    через API listFiles() -> если files != null т. е. проинициализировалась File[] files - не пустое
    то результат перезаписываю т.е. result будет равен [files.length] количеству файлов лежащих
    в папке -> идем циклом for по массиву files и говору на каждой итерации file = files[i] и
    кладём в переменную имени name, имени файла file.getName().
    Далее проверяем если папка является файлом то выводим System.out.println("\tFile - " + name),
    иначе выводим, что директория  System.out.println("Dirictorry - " + name) -> result[i]
    присваиваем имя name.
    Далее если это не директория то выводим System.out.println(dir.getName() + " не является папка")
    и возвращаем результат.
     */
    public static String[] getFileNamesInDir(){
        File dir = new File(PATH);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()){
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    String name = file.getName();
                    if (file.isFile()) {
                        System.out.println("\tFile - " + name);
                    }else {
                        System.out.println("Dirictorry - " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " не является папка");
        }
        return result;
    }
}