package itacademy;

public class Reverse{

    public static void reverse(String input){
        IReverse reverse = (str) -> {   // lambda expression
            String result = "";
            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Lambda reversed is: " + reverse.func("Lambda Expression"));

        System.out.println("Enter a word to reverse a String:");
        String word = input;
        System.out.println(word +" in reversed form - " + reverse.func(word));
    }
}
