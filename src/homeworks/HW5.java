package homeworks;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        for(int i = number; i > 0; i--) {
            System.out.println(number-- + "");
        }
        for(int i = number; i < 0; i++){
            System.out.println(number++ + " ");
        }
        if (number ==0); {
            System.out.println(number);
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int input = scanner.nextInt();

        if (input >=0){

            for (int i = input; i >= 0; i--){
                System.out.print(i + " ");
            }
        }else {
            for (int i = input; i <= 0; i++){
                System.out.print(i + " ");
            }
        }
    }
}
