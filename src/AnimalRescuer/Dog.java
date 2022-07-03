package AnimalRescuer;

public class Dog {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){this.age = newAge;}
    private String race;
    public String getRace(){return race;}
    public void setRace(String newRace){this.race = newRace;}
    private String name;
    public String getName(){return name;}
    public void setName (String dogName) {this.name = dogName;}
    private String color;
    public String getColor(){return color;}
    public void setColor(String newColor){this.color = newColor;}
    private double weight;
    public double getWeight(){return weight;}
    public void setWeight(double newWeight){this.weight = newWeight;}
    private int heightCm;
    public int getHeightCm(){return heightCm;}
    public void setHeightCm(int newHeightCm){this.heightCm = newHeightCm;}
    private int health;
    public int getHealth(){return health;}
    public void setHealth(int newGetHealth){this.health = newGetHealth;}
    private String favFood;
    public String getFavFood(){return favFood;}
    public void setFavFood(String newGetFavFood){this.favFood = newGetFavFood;}




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
