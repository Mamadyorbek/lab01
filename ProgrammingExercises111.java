package programming.exercises.pkg1.pkg11;
import java.util.Scanner;
public class ProgrammingExercises111 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("The current population of the U.S is 312032486");
        System.out.print("Population of the U.S after (years): ");
        int years = inp.nextInt();
        int seconds = years * 31536000;
        int birth = seconds / 7;
        int death = seconds / 13;
        int immigrant = seconds / 45;
        int population = (birth - death + immigrant) + 312032486;
        System.out.println("The population of the US after " + years + " years" + " is " + population);
    }
    
}
