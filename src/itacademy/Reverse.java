package itacademy;

public class Reverse{

    public static void reverse(String texto){
        IReverse reverse = (str) -> {   // lambda expression
            String resultado = "";
            for (int i = str.length()-1; i >= 0; i--) //Empezamos por el final del String y vamos añadiendo letras
                resultado += str.charAt(i);
            return resultado;
        };
        System.out.println(texto + " al revés es: " + reverse.reverse(texto));
    }
}
