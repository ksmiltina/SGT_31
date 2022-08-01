import java.util.Scanner; //obligāti jāliek, lai atrastu scanner - user input

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        // print out "Good job!" if grade is over 6
        if (grade > 6){
            System.out.println("Good job!");
        }

        //print out if over 3
        if (grade > 3){
            System.out.println("Good job!");

        }

        //Print Goof job if grade is over 6, if 6 or lower, print "Best luck next time"
        if(grade > 6){
            System.out.println("Good job!");
        } else {
            System.out.println("Better luck next time!");

        }

        //fever, healthy
        float temperature = 38.5f;
        if (temperature > 36.8f){
            System.out.println("You have a fever!");
        } else {
            System.out.println("You are healthy.");
        }

        //ELSE IF
        if(grade < 4){
            System.out.println("Very bad!");
        } else if (grade >= 4 && grade <= 5){
            System.out.println("Okey!");
        } else if (grade == 6){
            System.out.println("Nice!");
       } else {
            System.out.println("Very good!");

        }


    }
}
