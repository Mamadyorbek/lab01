package what.is.your.name;
import java.util.Scanner;
public class WhatIsYourName {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.print("What is your name? ");
        String Name = MyObj.nextLine();
        System.out.println("Hello, " + Name + "!");
    }
    
}
