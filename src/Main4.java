import java.util.ArrayList;
import java.util.List;

// LAB 14 Liste
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

        op.twoParameters(myListOfInt,6); //1.Tema
        op.printNumbersFromList(myListOfInt); //2.Tema
        op.twoParametersFromList(myListOfInt,5); //3. Tema
        op.printNumbersBackwardsFromList(myListOfInt); //4. Tema
        op.replacePositionInListWithString(myListOfString,5,"brb"); //5. Tema
        op.secondParameterAddOnFirstPosition(myListOfInt,7); //6. Tema
        op.printListIndexAndElements(myListOfInt); //7. Tema
        System.out.println(op.getBiggestValueFromList(myListOfInt)); //8. Tema
    }
}
