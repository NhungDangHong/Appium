import java.util.Scanner;

public class Exercise_Lab2_2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height");
        double number = scanner.nextDouble();
        if (number /2 == 0)
        {
            System.out.print("This is even number");
        }
        else {
            System.out.print("This is odd number");
        }
    }
}
