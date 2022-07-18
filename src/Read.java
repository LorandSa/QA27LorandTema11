import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {
    public double getDouble() {
        double number = 0;
        boolean repeat;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter a number:");
                number = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("Value "+number+" is not a number!");
                repeat = true;
            }
        }while(repeat == true);
        return number;
    }
}
