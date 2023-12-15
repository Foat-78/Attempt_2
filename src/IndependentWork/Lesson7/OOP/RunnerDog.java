package IndependentWork.Lesson7.OOP;

public class RunnerDog {
    public static void main(String[] args) {
        Dog sharick = new Dog("Sharick", - 20, "Pimpa");
        System.out.println(sharick);
        sharick.setWeight(-1);
        System.out.println(sharick);
        System.out.println(sharick.getOwner());
        // Атрибуты по умолчанию
        Dog dog1 = new Dog();
        System.out.println(dog1);

    }
}
