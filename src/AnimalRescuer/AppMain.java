package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {

        Dog gicu = new Dog();
        System.out.println(gicu.getName());
        gicu.play();

        Adopter Patrick = new Adopter();
        Patrick.adopt();

        Dog rex = new Dog();
        rex.setName("Rex");
        System.out.println(rex.getName());

    }
}
