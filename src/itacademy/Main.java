package itacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import itacademy.Reverse;

public class Main {

    public static void main(String[] args) {

        // FASE 1
        List<Name> nomsPropis = new ArrayList<>();

        Name nom1 = new Name("Marc");
        nomsPropis.add(nom1);
        Name nom2 = new Name("Noemi");
        nomsPropis.add(nom2);
        Name nom3 = new Name("Aaa");
        nomsPropis.add(nom3);
        Name nom4 = new Name("Alb");
        nomsPropis.add(nom4);

        String firstLetter = "A";
        Integer length = 3;

        nomsPropisWithFirstCharXAndCertainLength(nomsPropis,firstLetter,length);


        List<Integer> llista2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        llistaIntegersWithOddAndEven(llista2);

        List<String> llista3 = new ArrayList<>(Arrays.asList("eeos","wibcpwbecpqwe","pwbqopqocbwe","sdobcowiebcowiec"));

        llistaStringsWithLetterO(llista3);
        llistaStringsWithMoreThanFiveLetters(llista3);

        List<String> mesos = new ArrayList<>(Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Septembre","Octubre","Novembre","Desembre"));
        printMonths(mesos);

        // FASE 2

        Pi pi = new Pi();
        double value = pi.getPiValue(3.1415);
        System.out.println(value);

        Reverse.reverse("hola");

    }


    public static List<String> namesWithPredicate(List<Name> nomsPropis, Predicate<Name> tester) {
        List<String> sub = new ArrayList<>();
        for (Name n : nomsPropis) {
            if (tester.test(n)) {
                //n.printName();
                sub.add(n.getName());
            }
        }
        return sub;
    }

    public static void nomsPropisWithFirstCharXAndCertainLength(List<Name> nomsPropis, String firstLetter, Integer length){
        List<String> output1 = namesWithPredicate(nomsPropis,
                n -> n.getFirstChar() == firstLetter.charAt(0)
                        && n.getLength() == length
        );

        output1.forEach(System.out::println);
    }

    public static List<String> integersOddEvenWithPredicate(List<Integer> llista, Predicate<Integer> tester){

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
        List<String> output2 = integersOddEvenWithPredicate(llista,
                i -> i%2 == 0
        );
        output2.forEach(System.out::println);
    }

    public static List<String> stringsWithALetterO(List<String> llista, Predicate<String> tester){
        List<String> output = new ArrayList<>();
        for (String s : llista) {
            if (tester.test(s)) {
                output.add(s);
            }
        }
        return output;
    }

    public static void llistaStringsWithLetterO(List<String> llista) {
        List<String> output3 = stringsWithALetterO(llista,
                s -> s.contains("o")
                    || s.contains("O"));
        output3.forEach(System.out::println);

    }

    public static List<String> stringsWithMoreThanFiveLetters(List<String> llista, Predicate<String> tester){
        List<String> output = new ArrayList<>();
        for (String s : llista) {
            if (tester.test(s)) {
                output.add(s);
            }
        }
        return output;
    }

    public static void llistaStringsWithMoreThanFiveLetters(List<String> llista) {
        List<String> output3 = stringsWithMoreThanFiveLetters(llista,
                s -> (s.contains("o")
                        || s.contains("O"))
                        && s.length() > 5);
        output3.forEach(System.out::println);

    }

    public static void printMonths(List<String> mesos){
        // Opció 1
        mesos.forEach(mes -> System.out.print(mes + " "));
        // Opció 2
        mesos.forEach(System.out::println);

    }


}