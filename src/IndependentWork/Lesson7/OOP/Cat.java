package IndependentWork.Lesson7.OOP;

import java.util.Arrays;

public class Cat {
    //Атрибуты (свойства, поле)
   public String color;
    double weight;
    String ownerName;

    //Конструктор
    public Cat(String colorName, double weightCat, String owner){
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    // Метод - это функция которая направлено на выполнение действия экземпляра класса
    public void destroySofa(String sofaOwner){
        System.out.printf("Кот дерёт диван %s!!!", sofaOwner);
    }

    // Метод перегрузка - это когда метод с одинаковым названием и с различным количеством аргументов
    public String hunt(boolean isDay, boolean auccess){
        if (auccess){
            if (isDay){
                return "Кот принёс мышь";
            } return "Кот принёс сову";
        }return "Кот ничего не принес!!!";
    }

    public String hunt(boolean isDay){
        if (isDay){
            return "Кот принёс мышь";
        } return "Кот принёс сову";
    }

    // Метод varArgs - это когда можно передать большое количество значении к аргументу
    // но когда в методе
    public void feed(String ...product){
        System.out.printf("Кот поел: %s", Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
