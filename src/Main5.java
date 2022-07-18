import java.util.InputMismatchException;
import java.util.Scanner;

// LAB 15 Error Handling

public class Main5 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        try {
//            int[] myArray = new int[]{3,4,5};
//            System.out.println(myArray[scan.nextInt()]);
//        }catch (IndexOutOfBoundsException e){
//            System.err.println("S-a introdus un numar inafara limitei!");
//        }catch (InputMismatchException e){
//            System.err.println(" Introduceti un numar!");
//        }

        Read read = new Read();
        double x = read.getDouble();
        System.out.println(x);
    }

}
