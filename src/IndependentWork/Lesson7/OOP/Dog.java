package IndependentWork.Lesson7.OOP;

public class Dog {
    private String name = "Belka";
    private int weight = 60;
    private String owner = "Foat";

    // Блок инициализации
    {
        System.out.println("Собака родилась");
    }

    public Dog(){

    }

    public Dog(String name, int weight, String owner) {
        if (weight < 6){
            this.weight = 8;
        }else {
            this.weight =weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void setWeight(int newWeight){
        if (newWeight < 6){
            this.weight = 8;
        }else {
            this.weight =newWeight;
        }
    }

    public String getOwner(){
        return "Ms. " + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", owner = '" + owner + '\'' +
                '}';
    }
}
