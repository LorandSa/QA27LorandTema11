package AnimalRescuer;

public class Dog {
    private int age;
    private String race;
    private String name;
    public String getName(){
        return name;
    }
    public void setName (String dogName) {
        this.name = dogName;
    }
    private String color;
    private double weight;
    private int heightCm;
    private int health;
    private String favFood;




    public void eat(){
        System.out.println("eating dog food");
    }
    public void sleep(){
        System.out.println("snores");
    }
    public void speak(){
        System.out.println("HAM");
    }
    public void play(){
        System.out.println("Fetch!");
    }
}
