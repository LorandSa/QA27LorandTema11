package AnimalRescuer;

public class PetFood {
    private String food = "Royal Canin";
    public String getFood(){return food;}
    public void setFood(String newFood){this.food = newFood;}
    private int price = 50;
    public int getPrice(){return price;}
    public void setPrice(int newPrice){this.price = newPrice;}
    private int cant = 100;
    public int getCant(){return cant;}
    public void setCant(int newCant){this.cant = newCant;}
    private int stock = 300;
    public int getStock(){return stock;}
    public void setStock(int newStock){this.stock = newStock;}

    public void foodPrice(){
        System.out.println(food +" costs: "+ price);
    }
}
