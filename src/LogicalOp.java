import java.util.Arrays;
import java.util.List;
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
    public void showNumbersBetween(int x,int y){
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

        public void showOddNumbers(){
        int number=100;
        System.out.print("List of odd numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)
        {
            if (i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
    }
        public void showEvenNumbers(){
        int number=100;
        System.out.print("List of even numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)
        {
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
        }
    }

        public double getIntervalSum(int start){

        int sum = 0;

        while(start<=100){
            sum+=start;
            start++;
        }
        return sum;
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
    public void countToHundred(int start){

        while(start<100){
            start+=1;
            System.out.println(start);
        }
    }
    public void countToMinusHundred(int start){

        while(start>-100){
            start-=1;
            System.out.println(start);
        }
    }
    public void fibonacciSeries(){
        int i = 1, n = 20, firstTerm = 0, secondTerm = 1;
        System.out.println("Sirul Fibonacci pana la: " + n);

        while (i <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }
    public void wozaCozaLoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }
    public void printPattern() {
        for (int j = 7; j >= 1; j--) {
            String text = "";
            for (int i = j; i >= 1; i--) {
                text = text + "*";
            }
            System.out.println(text);
        }
    }

    /////////////// LAB 13
    public int[] populateArrayUpToNumber(int number){
        int[] array = new int[number];
            for (int i=0; i<array.length; i++){
                array[i]=i+1;
        }return array;
    }
    public int[] getEvenArrayToHundred(int[] evenArray) {
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenArray[j] = i;
                j++;
            }
        }
        return evenArray;
    }
    public int[] getSumOfEvensAndOdds(int[] input) {

        int x[] = input;
        int even = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0)
                even += x[i];
        }
        return x;
    }
    public double getAverageFromArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public boolean isValueInArray(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }return false;
    }
    public int getPositionInArray(int[] Numbers, int nr) {
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == nr) {
                return i;
            }
        }
        return 0;
    }
    public void showLines() {
        String[] line = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-",};
        for (int i = 0; i <= 10; i++) {
            System.out.println(Arrays.toString(line));
        }
    }
    public int[] removeFromArray(int[] myArray, int nr) {
        int[] secondArray = new int[myArray.length];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == nr)
                continue;
            secondArray[j++] = myArray[i];
        }
        int[] finArray = new int[j];
        for (int i = 0; i < j; i++)
            finArray[i] = secondArray[i];
        return finArray;
    }
    public int getSecondSmallestNrInArray(int[] myArray) {
        int temp = 0;
        for(int i = 0; i< myArray.length;i++){
            for(int j = i + 1;j<myArray.length;j++){
                if(myArray[i] > myArray[j]){
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;
                }
            }
        }
        return myArray[1];
    }

    public int[] copyArray(int[] firstArray, int[] emptyArray) {
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            emptyArray[j] = firstArray[i];
            j++;
        }
        return emptyArray;
    }

    ////////////// LAB 14
    public void printNumbersBackwardsFromList(List<Integer> myList){
        for (int i = myList.size()-1;i>=0;i--){
            System.out.println(myList.get(i));
        }
    }
    public void twoParameters(List<Integer> myList,int a){
          myList.add(a);
        System.out.println(myList);
    }
    public void printNumbersFromList(List<Integer> myList){
        for (int i=0;i<100;i++){
            System.out.println(myList.get(i));
        }
    }
    public void twoParametersFromList(List<Integer> myList,int a){
        for (int i=a-1;i<100;i++) {
            System.out.println(myList.get(i));
        }
    }

    public void replacePositionInListWithString (List<String> myList, int a, String text){
        myList.set(a-1,text);
        System.out.println(myList);
    }
    public void secondParameterAddOnFirstPosition (List<Integer> myList, int a){
        myList.add(0,a);
        System.out.println(myList);
    }
}
