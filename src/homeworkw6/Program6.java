package homeworkw6;

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {

        double radius,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle (cm):");
        radius = input.nextDouble();
        input.close();

        area= Math.PI * radius * radius;

        System.out.println("Area of the circle is (cm²):" + area);


    }
}
