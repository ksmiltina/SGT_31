public class Operators {
    public static void main(String[] args) {
        //math operations + - / * %
        int x = 100;
        x += 100;
        //x = x + 100
        System.out.println("x = " + x);

        //incrementation operators
        //post-incrementation
        int num = 10;
        System.out.println("num = " + ++num);
        System.out.println("num = " + num++);
        System.out.println("num = " + num);

        //post-incrementation
        int num2 = 20;
        System.out.println("num = " + ++num2);
        System.out.println("num = " + num2++);
        System.out.println("num = " + num2);

        //increase or decrease variable by one
        int var = 10;
        var += 1;
        var = var + 1;
        ++var;
        var++;
        var -=1;
        var = var + 1;
        --var;
        var--;

        //relation operators
        //equality ==
        int a = 1;
        int b = 10;
        System.out.println("Equality = " + (a == b)); //a = b ?

        //Greater than > and greater than or equal to >=
        System.out.println(a > b); //if a is greater than b
        System.out.println(a >= b); // if a is greater or equal to b

        //Less than < and less than or equal to <=
        System.out.println(a < b);
        System.out.println(a <= b);

        //Logical operators
        //Logical AND - &&
        boolean wind = true;
        boolean weather = true;
        System.out.println(wind && weather);

        //Logical OR - ||
        boolean sale = false;
        boolean rich = true;
        System.out.println(sale || rich);





    }
}
