package itacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Name> nomsPropis = new ArrayList<>();

        Name nom1 = new Name("Marc");
        nomsPropis.add(nom1);
        Name nom2 = new Name("Noemi");
        nomsPropis.add(nom2);
        Name nom3 = new Name("aaa");
        nomsPropis.add(nom3);
        Name nom4 = new Name("Alb");
        nomsPropis.add(nom4);

        String firstLetter = "A";
        Integer length = 3;

        nomsPropisWithFirstCharXAndCertainLength(nomsPropis,firstLetter,length);


        List<Integer> llista = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        llistaIntegersWithOddAndEven(llista);


    }


    public static List<Name> printNamesWithPredicate(List<Name> nomsPropis, Predicate<Name> tester) {
        List<Name> sub = new ArrayList<>();
        for (Name n : nomsPropis) {
            if (tester.test(n)) {
                n.printName();
                sub.add(n);
            }
        }
        return sub;
    }

    public static void nomsPropisWithFirstCharXAndCertainLength(List<Name> nomsPropis, String firstLetter, Integer length){
        printNamesWithPredicate(nomsPropis,
                n -> n.getFirstChar() == firstLetter.charAt(0)
                        && n.getLength() == length
        );
    }

    public static List<String> integersOddEven(List<Integer> llista, Predicate<Integer> tester){

        List<String> output = new ArrayList<>();
        for (Integer i : llista) {
            if (tester.test(i)) {
                output.add("e" + i);
            }
            else {
                output.add("o" + i);
            }

        }
        return output;
    }

    public static void llistaIntegersWithOddAndEven(List<Integer> llista){
        integersOddEven(llista,
                i -> i%2 == 0
        );
    }




}