import java.util.Scanner;

public class LogicalOp
{
    public int CheckBiggerNumber()
    {
        Scanner OperatiiLogice = new Scanner(System.in);

        System.out.println("Introduceti primul numar din comparatie:");
        int firstNumber = OperatiiLogice.nextInt();
        System.out.println("Introduceti al doilea numar din comparatie:");
        int secondNumber = OperatiiLogice.nextInt();

        if (firstNumber > secondNumber)
        {

            return firstNumber;

        } else
        {

            return secondNumber;

        }

    }
    public void Shownumber()
    {
        System.out.println("Numarul mai mare este: "+CheckBiggerNumber());
    }
}
