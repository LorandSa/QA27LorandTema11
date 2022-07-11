import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List <Integer> myList = new ArrayList<>();
        myList.add(3);
        System.out.println(myList.get(0));
        System.out.println(myList.size());

        List <String> myListOfString = new ArrayList<>();
        for (int i = 1;i<=100;i++){
            myListOfString.add(i+"");
        }
        System.out.println(myListOfString);

        List<Integer> myListOfInt = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            myListOfInt.add(i);
        }

        LogicalOp op = new LogicalOp();
        //op.printNumbersBackwardsFromList(myListOfInt);
        //op.twoParameters(myListOfInt,6); //1.Tema
        //op.printNumbersFromList(myListOfInt); //2.Tema
        op.twoParametersFromList(myListOfInt,5); //3. Tema
    }
}
