package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("Addition : " + "\n" + number1 + "+" + number2 + " = " + (number1 + number2));
        System.out.println("Subtraction : " + "\n" + number1 + "-" + number2 + " = " + (number1 - number2));
        System.out.println("Multiplication : " + "\n" + number1 + "*" + number2 + " = " + (number1 * number2));
        System.out.println("Remainder : " + "\n" + number1 + "%" + number2 + " = " + (number1 % number2));
        System.out.println("Division : " + "\n" + number1 + "/" + number2 + " = " + (number1 / number2));
    }
}

