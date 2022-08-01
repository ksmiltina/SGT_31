public class CharExample {
    public static void main(String[] args) {

        char letter = 'a';
        for (letter = 'a'; letter < 123; letter++) {
            System.out.println(letter + " ");

        }

        //abcdefghijklmnopqrstuvwxyz
        for (int i = 97; i <= 122; i++){
            System.out.print((char)i + " ");
        }
    }
}
