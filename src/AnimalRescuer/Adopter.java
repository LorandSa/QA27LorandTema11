package AnimalRescuer;

public class Adopter {
    private String name = "Patrick";
    private int cash = 300;

    public void adopt(){
        System.out.println("Adopted by: "+ name);
    }
    public void adoptBudget(){
        System.out.println("Budget available: "+ cash);
    }

    public String getName(){return name;}
    public void setName(String newName){this.name = newName;}

    public int getCash(){return cash;}
    public void setCash(int newCash){this.cash = newCash;}
}
