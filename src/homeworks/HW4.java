package homeworks;

import javax.swing.*;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year!");
        int year = scanner.nextInt();


        if((year % 4 ==0 && year % 100 !=0) || year % 400 == 0){
            System.out.println("The year is a leap year!");
        } else {
            System.out.println("It is not a leap year!");
        }



    }
}
