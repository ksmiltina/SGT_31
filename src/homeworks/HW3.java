package homeworks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Please enter a number!");
        num1 = scanner.nextInt();
        System.out.println("Please enter another number!");
        num2 = scanner.nextInt();
        System.out.println("Please enter the final number!");
        num3 = scanner.nextInt();

        int max = Math.max(num1, num2);
        max = Math.max(max, num3);
        System.out.println("Max number is: " +max);

    }
}
