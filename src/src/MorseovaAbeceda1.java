public class MorseovaAbeceda1 {


        public static void main (String[]args){


// řetězec, který chceme dekódovat
            String s = ".- -... -.-. -.. ";
            System.out.printf("Původní zpráva: %s\n", s);
// řetězec s dekódovanou zprávou
            StringBuilder zprava = new StringBuilder();

// vzorová pole
            String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
            String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                    "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                    "...-", ".--", "-..-", "-.--", "--.."};

// rozbití řetězce na znaky morzeovky
            String[] znaky = s.split(" ");

// iterace znaky morzeovky
            for (String morseuvZnak : znaky) {
                char abecedniZnak = '?';

                int index = -1;
                for (int i = 0; i < morseovyZnaky.length; i++) {
                    if (morseovyZnaky[i].equals(morseuvZnak))
                        index = i;
                }

                if (index >= 0) { // znak nalezen
                    abecedniZnak = abecedniZnaky.charAt(index);
                }
                zprava.append(abecedniZnak);
            }

            System.out.printf("Dekódovaná zpráva: %s\n", zprava.toString());
        }
    }


