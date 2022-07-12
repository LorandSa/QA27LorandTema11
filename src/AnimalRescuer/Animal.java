package AnimalRescuer;

public class Animal extends Dog{
    private int age;
    private String race;
    private String name;
    private String color;
    private double weight;
    private int heightCm;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public void eat() {
        System.out.println("eating dog food");
    }

    public void sleep() {
        System.out.println("Snores..zzzz");
    }

    public void speak() {
        System.out.println("Ham!");
    }

    public void play() {
        System.out.println("Playing fetch");
    }
}