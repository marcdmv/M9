package itacademy;

import java.util.ArrayList;
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

        printPersonsWithPredicate(nomsPropis,
                n -> n.getFirstChar() == firstLetter.charAt(0)
                && n.getLength() == length
                );
    }

    public static void printPersonsWithPredicate(List<Name> nomsPropis, Predicate<Name> tester) {
        for (Name n : nomsPropis) {
            if (tester.test(n)) {
                n.printName();
            }
        }
    }


}