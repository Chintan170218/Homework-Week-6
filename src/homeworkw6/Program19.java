package homeworkw6;

import java.util.Locale;
import java.util.Scanner;

public class Program19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text in Uppercase:");
        String userInputString = scanner.nextLine();

        System.out.println("Lowercase version of entered text:" + userInputString.toLowerCase());

    }
}
