package homeworkw6;

import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first value: ");
        int num1 = in.nextInt();

        System.out.print("Input second value: ");
        int num2 = in.nextInt();

        System.out.print("Input third value: ");
        int num3 = in.nextInt();

        System.out.println("Average of the three values are: " + (num1 + num2 + num3) / 3);
    }
}

