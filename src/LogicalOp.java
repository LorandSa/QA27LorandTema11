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
        {return firstNumber;}
        else
        {return secondNumber;}

    }
    public String TextComparison()
    {
        Scanner OperatiiLogice = new Scanner(System.in);
        System.out.println("Introduceti primul text din comparatie:");
        String first = OperatiiLogice.next();
        System.out.println("Introduceti al doilea text din comparatie:");
        String second = OperatiiLogice.next();

        if ( first.equals(second) ) {System.out.println("Sunt la fel!");}
        else {System.out.println("Nu sunt la fel!");}
        return TextComparison();
    }
    public String verifyTextAndNumber(String textInput, int number) {

        if (textInput.equals("FastTrack") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";
    }
    public void printToHundred(int x){
        for (int i=x;i<=100;i++){
            System.out.println(i);
        }
    }
    public void printToMinusHundred(int x){
        for (int i=x;i>=-100;i--){
            System.out.println(i);
        }
    }

    public double avgToHundred(int x){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
            System.out.println(x);
        }
        return sum/100d;

    }
    public void decrease(int x,int y){
        if (x>y){
        for (int a=x;a>=y&&x>=y;x--){
               System.out.println(x);
        }
        }else {
            for (int a=x;a<=y&&y>=x;x++){
                System.out.println(x);
            }
        }
    }
     public double getAvgInterval(int start, int finish){

        int sum = 0;
        double count = 0;

        while(start<=finish){
            sum+=start;
            start++;
            count++;
        }
        return sum/count;
     }

     public double getAvgForEvenInterval(int start,int finish){
        int sum = 0;
         double count = 0;
         while(start<=finish){
             if (start % 2 == 0){
                 sum+=start;
                 count++;
             }start++;
         }return sum/count;
     }

}
