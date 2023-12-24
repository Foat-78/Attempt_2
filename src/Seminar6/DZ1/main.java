package Seminar6.DZ1;



import java.util.*;

public class main {
    public static void main(String[] args) {

        Product NB = new Product("Asus", 50_000, "win7", 16, 512, "black");
        Product NB1 = new Product("Aser", 60_000, "win10", 8, 512, "white");
        Product NB2 = new Product("Asus", 70_000, "linux1", 16, 512, "black");
        Product NB3 = new Product("Asus", 70_000, "linux1", 16, 256, "black");
        Product NB4 = new Product("Aser", 75_000, "win10", 8, 256, "white");
        Product NB5 = new Product("eMachines", 7_000, "vista", 6, 128, "black");
        Product NB6 = new Product("MSI", 95_000, "linux2", 18, 1024, "white");
        Product NB7 = new Product("MSI", 85_000, "win11", 16, 1024, "grey");

        Set<Product> laptops = new HashSet<>();
        laptops.add(NB);
        laptops.add(NB1);
        laptops.add(NB2);
        laptops.add(NB3);
        laptops.add(NB4);
        laptops.add(NB5);
        laptops.add(NB6);
        laptops.add(NB7);

        System.out.println("Товары в наличии:");
        int count = 1;
        for (Product prod : laptops) {
            System.out.printf("%d -> %s;\n", count++, prod);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите товар по характеристикам: \nПо объёму оперативной памяти: ");
        int ssd = sc.nextInt();
        System.out.print("По объёму жесткого диска: ");
        int ddr = sc.nextInt();
        System.out.println("Товары подходящие по вашему запросу: ");
        int count1 = 1;
        for (Product prod: laptops) {
            if (prod.getSsd() >= ssd && prod.getDdr() >= ddr) {
                System.out.printf("%d -> %s;\n", count1++, prod);
            }
        }
        System.out.println("Товары подходящие по вашему запросу нет в наличии: ");
    }
}
