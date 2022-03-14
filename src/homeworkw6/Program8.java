package homeworkw6;

import java.util.Scanner;

public class Program8{

        public static void main(String[] args) {


            double base, height;
            int a=2;
            Scanner area = new Scanner(System.in);


            System.out.println("Enter base length (cm):");
            base = area.nextDouble();


            System.out.println("Enter height length (cm):");
            height = area.nextDouble();


            System.out.println("Area of triangle (cm²):");
            System.out.println((base*height)/a);
        }

}
