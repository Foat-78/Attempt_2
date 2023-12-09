package Seminar3;

import java.util.ArrayList;
import java.util.List;

// аталог товаров книжного магазина сохранен в виде двумерного списка
// List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего
// списка содержитс€ название жанра, а на остальных позици€х - названи€ книг.
// Ќапишите метод дл€ заполнени€ данной структуры.
public class Task04 {
    static List<ArrayList<String>> shopBook = new ArrayList<>();
    public static void main(String[] args) {

        ArrayList<String> proza = new ArrayList<>();
        proza.add(0, "проза");
        proza.add("Ѕуратино");

        ArrayList<String> poezia = new ArrayList<>();
        poezia.add(0, "поэзи€");
        poezia.add("ќнегин");

        addBooks(proza);
        addBooks(poezia);

        System.out.println(shopBook);
    }

        static void addBooks(ArrayList<String> books){
        shopBook.add(books);
        }
    }


