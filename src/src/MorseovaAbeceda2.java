public class MorseovaAbeceda2 {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.printf("Původní zpráva: %s\n", s);

        String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        char[] abc = abecedniZnaky.toCharArray();
        char[] pismena = s.toCharArray();
        int index = -1;
        String znak = "";
        StringBuilder morseovka = new StringBuilder();

        for (char pismeno : pismena){
            for (int i = 0; i < abc.length; i++) {
                    if (abc[i] == pismeno) {
                        index = i;
                    }
                    if (index >= 0){
                        znak = morseovyZnaky[index]+" " ;
                    }
                }
            System.out.println(znak);
            morseovka.append(znak);
            }
        System.out.println(morseovka);
    }
}
