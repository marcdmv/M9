package itacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import itacademy.Reverse;

public class Main {

    public static void main(String[] args) {

        // FASE 1
        System.out.println("- Fase 1");
        List<Name> nomsPropis = new ArrayList<>();

        //Emplenem la llista amb noms propis
        Name nom1 = new Name("Marc");
        nomsPropis.add(nom1);
        Name nom2 = new Name("Noemi");
        nomsPropis.add(nom2);
        Name nom3 = new Name("Albert");
        nomsPropis.add(nom3);
        Name nom4 = new Name("Ana");
        nomsPropis.add(nom4);

        //Definim les condicions del tester
        String firstLetter = "A";
        Integer length = 3;

        System.out.println("-- Punto 1");
        nomsPropisWithFirstCharXAndCertainLength(nomsPropis,firstLetter,length);

        //Definim una llista d'Integers
        List<Integer> llista2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("-- Punto 2");
        llistaIntegersWithOddAndEven(llista2);

        //Definim una llista de Strings
        List<String> llista3 = new ArrayList<>(Arrays.asList("eeos","wibcpwbecpqwe","pwbqopqocbwe","sdobcowiebcowiec"));

        //Cridem el mètode que ens diu si tenen la lletra "o"
        System.out.println("-- Punto 3");
        llistaStringsWithLetterO(llista3);
        //Amb la mateixa, cridem el mètode que ens diu si a més tenen més de 5 lletres
        System.out.println("-- Punto 4");
        llistaStringsWithMoreThanFiveLetters(llista3);

        //Definim la llista de mesos i cridem el mètode printMonths
        System.out.println("-- Punto 5");
        List<String> mesos = new ArrayList<>(Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Septembre","Octubre","Novembre","Desembre"));
        printMonths(mesos);

        // FASE 2

        System.out.println("- Fase 2");
        //Creamos un objeto de tipo Pi. En la clase Pi se ha implementado la Functional Interface (un único método abstracto)
        Pi pi = new Pi();
        //Llamamos el método de la clase pi getPiValue() para que nos devuelva su valor
        double value = pi.getPiValue();
        //Imprimimos el resultado que nos devuelve el método
        System.out.println(value);

        // FASE 3
        System.out.println("- Fase 3");
        //Definimos el String
        String texto = "Hola";
        //Llamamos el método reverse de la clase Reverse
        Reverse.reverse(texto);

    }


    public static List<String> namesWithPredicate(List<Name> nomsPropis, Predicate<Name> tester) {
        List<String> sub = new ArrayList<>();
        for (Name n : nomsPropis) {
            if (tester.test(n)) {
                sub.add(n.getName());
            }
        }
        return sub;
    }

    public static void nomsPropisWithFirstCharXAndCertainLength(List<Name> nomsPropis, String firstLetter, Integer length){
        //Passem els noms propis pel tester i acabem tening una llista de Strings amb els noms que han passat la prova
        List<String> sub = namesWithPredicate(nomsPropis,
                n -> n.getFirstChar() == firstLetter.charAt(0)
                        && n.getLength() == length
        );

        //Imprimim la llista final
        sub.forEach(System.out::println);
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
        //Com al punt anterior, pasem cada Integer pel tester, i si és parell (even) li asignem una "e" i si
        //es imparell (odd) li assignem una "o"
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
        mesos.forEach(mes -> System.out.print(mes + "\n"));
        // Opció 2
        // mesos.forEach(System.out::println);

    }


}