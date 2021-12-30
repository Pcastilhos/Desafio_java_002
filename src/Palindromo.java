//import java.util.Arrays;

    public class Palindromo {

        public static void main(String[] args) {
            String palavra = "parar";
            String stringArray = palavra;
            String[] ab = stringArray.split("(?!^)");
            int y = ab.length;
            System.out.println( "Palavra :" +palavra);
            for ( int x = y-1, i = 0 ; x >= 0 && i <= y; --x, ++i) {
                if ( ab[x].contentEquals(ab[i]) )
                    System.out.println("o menor número de caracteres que precisam ser adicionados ao fim da palavra para torná-la um palíndromo é :\n 0");
                else
                    System.out.println("o menor número de caracteres que precisam ser adicionados ao fim da palavra para torná-la um palíndromo é :\n" +x);
                    break;
            }
        }
    }

