package itacademy;

public class Reverse{

    public static void reverse(String input){
        IReverse reverse = (str) -> {   // lambda expression
            String result = "";
            for (int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println(input + " al revés es: " + reverse.func(input));
    }
}
