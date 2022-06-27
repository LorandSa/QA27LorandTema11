import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        Calculator suma = new Calculator();
//        suma.CalcSum();
//        suma.CalcMinus();
//        suma.CalcInmultire();
//        suma.CalcImpartire();

        LogicalOp Logical = new LogicalOp();

//        System.out.println("Numarul mai mare este:" +Logical.CheckBiggerNumber());
//        Logical.TextComparison();

        Scanner operatiiLogice = new Scanner(System.in);
        System.out.println("Introduceti text:");
        String textInput = operatiiLogice.next();
        System.out.println("Introduceti numar:");
        int number = operatiiLogice.nextInt();
        Logical.verifyTextAndNumber(textInput, number);
    }
}