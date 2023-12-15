package IndependentWork.Lesson7.OOP;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("White", 3.5, "Timur");
        System.out.println(cat);
        // Можно вывести отдельные атрибуты
        System.out.println(cat.weight);
        System.out.println(cat.color);
        System.out.println(cat.ownerName);
        // Можно поменять отдельные атрибуты
//        cat.color = "Red";
        System.out.println(cat.color = "Red");

        cat.destroySofa("Тимура");
        String hunt = cat.hunt(false);
        System.out.println("\n" + hunt + "\n");

        String hunt1 = cat.hunt(false, false);
        System.out.println(hunt1);

        cat.feed("рыбу", "корм", "попил воды");
    }
}
