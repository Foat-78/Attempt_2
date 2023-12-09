package Seminar2.Task05_log;


import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class log {
    /*
     Коментарии к блоку стр.20-23
     Создаём статическии блок (JBM есть три блока памяти и один из них статическии и это память работает до
     запуска приложения) и такие блоки создаются для настройки приложения до его запуска.
     В данном блоке мы говорим, что есть переменная FileInputStream которая будет принимать данные из
     файла "log.config". Далее наш блок вычитает все настройки из файла "log.config" автоматический.
     Так же Java есть стандартный класс LogManager у которого есть метод getLogManager() и этот метод
     возвращает нам getLogManager() по сути менеджер логировать. А так же нам нужно вызвать метод
     readConfiguration(in), таким образом мы наше приложение подгружаем все настройки для логера.
    */
    static {
        try (FileInputStream in = new FileInputStream("log.config")){ // Относительный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(in);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    Коментарии к блоку стр. 33-35
    Есть еще дополнительный метод который возвращает нам стандартный Java логер, под названием log,
    который принимает строку под названием className которую нужно залогировать и возвращает стандартный Java Logger
    для класса с именем className.
     */
    public static Logger log(String className) {

        return Logger.getLogger(className);
    }
}
