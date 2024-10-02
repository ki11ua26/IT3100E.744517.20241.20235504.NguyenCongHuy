package lab_01;

import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double num1 = myObj.nextDouble();
        double num2 = myObj.nextDouble();
        if(num2 == 0){
            System.out.println("No quotient result");
        }else System.out.println("Quotient: " + (num1/num2));
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1*num2));

    }
}
