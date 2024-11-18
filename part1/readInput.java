package part1;
import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {
        // create scanner instance
        Scanner scanner = new Scanner(System.in);

        // input question
        System.out.println("What is your name ?");


        // fetch user input
        String name = scanner.nextLine();

        // output name
        System.out.println("Hello " + name + "!");
    }
}