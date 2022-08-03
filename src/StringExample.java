public class StringExample {
    public static void main(String[] args) {

        String text1 = "This is a text example";
        String text2 = text1.intern();
        System.out.println(text2);

        //contetation of strings
        String input1 = "This is ";
        String input2 = "an input text.";

        String inputCombine = input1.concat(input2);
        System.out.println(inputCombine);

        //comparing strings (texts)
        String val1 = "Test";
        String val2 = "Test";
        System.out.println(val1.equals(val2));

        //string class methods
        String inputText = "This is my text";

        //lenght cik vienibas tekstaa
        System.out.println(inputText.length());

        //to uppercase
        System.out.println(inputText.toUpperCase());

        System.out.println(inputText);

        //string class methods - indexOf kads numurs ir pirmajai vienibai
        String speakingText = "This is a test value";
        System.out.println(speakingText.indexOf('e'));
        System.out.println(speakingText.indexOf(" is "));

        //replaceAll
        //Šūdas
        String textForTv = "This phone is complete šūdas. And this case also is šūdas.";
        System.out.println(textForTv.replaceAll("šūdas", "š****"));

        //character index
        //System.out.println(textForTv.charAt(textForTv.length()-1));

        //substring
        System.out.println(textForTv.substring(5));
        System.out.println(textForTv.substring(5, 12));

        //parsing
        //converting String to primitive Data types
        String intValue = "164";
        String floatValue = "2.0";
        String doubleValue = "2.67876543456789";
        String boolValue = "true";
        String longValue = "39000000000000";

        System.out.println(Integer.parseInt(intValue) + 6);
        System.out.println(Float.parseFloat(floatValue));
        System.out.println(Double.parseDouble(doubleValue));
        System.out.println(Boolean.parseBoolean(boolValue));



    }
}
