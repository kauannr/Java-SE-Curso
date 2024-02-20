public class App {
    public static void main(String[] args) throws Exception {
        String s = "abadd";

        // Divida a string em sub-strings.
        String[] subStrings = s.split("");

        // Verifique se cada sub-string é um palíndromo.
        for (String subString : subStrings) {
            if (isPalindromo(subString)) {
                System.out.println(subString + " é um palíndromo");
                return;
            }
        }

        // Se nenhuma sub-string for um palíndromo, imprima "nenhuma sub-string é um
        // palíndromo".
        System.out.println("nenhuma sub-string é um palíndromo");
    }

    public static boolean isPalindromo(String str) {
        int tamanho = str.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (str.charAt(i) != str.charAt(tamanho - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
