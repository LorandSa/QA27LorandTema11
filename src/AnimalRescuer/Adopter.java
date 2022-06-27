package AnimalRescuer;

public class Adopter {
    String name = "Patrick";
    int cash = 300;

    public void adopt(){
        System.out.println("Adopted by: "+ name);
    }
    public void adoptBudget(){
        System.out.println("Budget available: "+ cash);
    }
}
