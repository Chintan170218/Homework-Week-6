package homeworkw6;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {


        double fahrenheit;
        int a = 32, b = 5, d = 9;
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter value in Fahrenheit:");
        fahrenheit = temp.nextDouble();

        System.out.println("Value in Celsius (°C):");
        System.out.println((fahrenheit-a)*b/d);
    }

}