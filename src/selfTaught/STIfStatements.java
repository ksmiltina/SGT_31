package selfTaught;

import java.util.Scanner;

public class STIfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age <= 25) {
            System.out.println("hey genZ");
        } else if (age > 25 && age <= 41) {
            System.out.println("Sup millenial");
        } else if (age > 42 && age <= 57) {
            System.out.println("genX how are you");
        } else {
            System.out.println("Ok Boomer");
        }
    }
}
