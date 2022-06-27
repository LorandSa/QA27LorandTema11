package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {

        Dog gicu = new Dog();
        System.out.println(gicu.name);
        gicu.play();

        Adopter Patrick = new Adopter();
        Patrick.adopt();

    }
}
