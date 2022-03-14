package homeworkw6;

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        char operator;
        int number1, number2, result;

        //Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        //Ask user to enter operation symbol
        System.out.println("Choose an operator:+,-,x,/");
        operator = input.next().charAt(0);

        // Ask user to enter first number
        System.out.println("Enter first number:");
        number1 = input.nextInt();

        // Ask user to enter second number
        System.out.println("Enter Second number:");
        number2 = input.nextInt();

        switch (operator) {
            //Addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
            //Subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;
            //Multiplication between numbers
            case 'x':
                result = number1 * number2;
                System.out.println(number1 + "x" + number2 + "=" + result);
                break;
            //Division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + "÷" + number2 + "=" + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }

}
