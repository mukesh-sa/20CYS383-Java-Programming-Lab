import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);


        System.out.println("----------Addition----------");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);


        System.out.println("\n----------Subtraction--------");
        System.out.print("Enter the first number: ");
        int num11 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num22 = scanner.nextInt();
        int diff = num11 - num22;
        System.out.println("The Difference of " + num11 + " and " + num22 + " is " + diff);
    }
}