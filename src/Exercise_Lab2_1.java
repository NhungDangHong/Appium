import java.util.Scanner;

public class Exercise_Lab2_1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height");
        double height = scanner.nextDouble();
        System.out.print("Please input your weight");
        double weight = scanner.nextDouble();
        double BMI = weight / (height * 2);
        if (BMI <18.5)
        {
            System.out.print("You are underweight");
        } else if (BMI>=18.5 && BMI<=24.9) {
            System.out.print("You are Normal weight");
        }
        else if (BMI>=25 && BMI<=29.9)
        {
            System.out.print("You are Over weight");
        }
        else
        {
            System.out.print("You are Obesity");
        }

    }
}
