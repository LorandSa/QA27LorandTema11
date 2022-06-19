import java.util.Scanner;

public class Calculator
{
    public int sum(int a,int b)
    {
        return a+b;
    }

    Scanner mycalc = new Scanner(System.in);

    public int minus(int x, int y)
    {
        return x-y;
    }

    public int inmultire(int x, int y)
    {
        return x*y;
    }

    public int impartire(int x, int y)
    {
        return x/y;
    }

    public void CalcSum()
    {
        System.out.println("Introduceti primul numar din suma:");
        int firstNumber = mycalc.nextInt();

        System.out.println("Introduceti al doilea numar din suma:");
        int secondNumber = mycalc.nextInt();

        System.out.println("Rezultatul este:"+sum(firstNumber,secondNumber));
    }

    public void CalcMinus()
    {
        System.out.println("Introduceti primul numar din scadere:");
        int firstNumber = mycalc.nextInt();

        System.out.println("Introduceti al doilea numar din scadere:");
        int secondNumber = mycalc.nextInt();

        System.out.println("Rezultatul este:"+minus(firstNumber,secondNumber));
    }

    public void CalcInmultire()
    {
        System.out.println("Introduceti primul numar din Inmultire:");
        int firstNumber = mycalc.nextInt();

        System.out.println("Introduceti al doilea numar din Inmultire:");
        int secondNumber = mycalc.nextInt();

        System.out.println("Rezultatul este:"+inmultire(firstNumber,secondNumber));
    }

    public void CalcImpartire()
    {
        System.out.println("Introduceti primul numar din Impartire:");
        int firstNumber = mycalc.nextInt();

        System.out.println("Introduceti al doilea numar din Impartire:");
        int secondNumber = mycalc.nextInt();

        System.out.println("Rezultatul este:"+impartire(firstNumber,secondNumber));
    }

}