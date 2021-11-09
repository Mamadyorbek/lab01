package operations.on.two.integers;
import java.util.Scanner;
public class OperationsOnTwoIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1st int? ");
        int integer = input.nextInt();
        System.out.print("2nd int? ");
        int integer1 = input.nextInt();
        int addition, subtraction, multiplication, division, remainder;
        addition = integer + integer1;
        subtraction = integer - integer1;
        multiplication = integer * integer1;
        division = integer / integer1;
        remainder = integer % integer1;
        System.out.println( + integer + " + " + integer1 + " = " + addition);
        System.out.println( + integer + " - " + integer1 + " = " + subtraction);
        System.out.println( + integer + " * " + integer1 + " = " + multiplication);
        System.out.println( + integer + " / " + integer1 + " = " + division);
        System.out.println( + integer + " % " + integer1 + " = " + remainder);
    }
    
}
