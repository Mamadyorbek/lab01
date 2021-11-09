package operations.on.two.doubles;
import java.util.Scanner;
public class OperationsOnTwoDoubles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1st double? ");
        double double1 = input.nextDouble();
        System.out.print("2nd double? ");
        double double2 = input.nextDouble();
        double addition, subtraction, multiplication, division, remainder;
        addition = double1 + double2;
        subtraction = double1 - double2;
        multiplication = double1 * double2;
        division = double1 / double2;
        remainder = double1 % double2;
        System.out.println( + double1 + " + " + double2 + " = " + addition);
        System.out.println( + double1 + " - " + double2 + " = " + subtraction);
        System.out.println( + double1 + " * " + double2 + " = " + multiplication);
        System.out.println( + double1 + " / " + double2 + " = " + division);
        System.out.println( + double1 + " % " + double2 + " = " + remainder);
    }
    
}

    
