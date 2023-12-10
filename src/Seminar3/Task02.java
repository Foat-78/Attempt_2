package Seminar3;
//1. Заполнить список названиями планет Солнечной
//системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его
//повторений в списке.
//2. Пройти по списку из предыдущего задания и удалить
//повторяющиеся элементы.

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {

        List<String> planets = new ArrayList<>();
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Pluto");

        countPlanet(planets);
    }


    private static void countPlanet(List<String> planets) {
        List<String> countPlanet = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (String planet : planets) {
            if (!countPlanet.contains(planet)) {
                countPlanet.add(planet);
                int count = 0;
                for (int i = 0; i < planets.size(); i++) {
                    String currentPlanet = planets.get(i);
                    if (planet.equals(currentPlanet)) {
                        count++;
                    }
                }
                builder.append(planet).append(": ").append(count).append(", ");
            }
        }
        System.out.println(builder);
    }
}
