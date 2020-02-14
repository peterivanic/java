public class AnalizaZnakovText {
    public static void main(String[] args) {
        String s = "Programátor se zasekne ve sprše, protože instrukce na šampónu byly: Namydlit, omýt, opakovat.";
        System.out.println(s);
        s = s.toLowerCase();

        int pocetPismen;
        int pocetSamohlasek = 0;
        int pocetSpoluhlasek = 0;

        String samoHlasky = "aeiouyáéěíóúůý";
        String spoluHlasky = "bcčdďfghjklmnpqrřsštťvwxzž";

        for (char c : s.toCharArray()) {

            for (int i = 1; i < samoHlasky.length(); i++) {
                if (c == samoHlasky.charAt(i)) {

                    pocetSamohlasek += 1;
                } else if (c == spoluHlasky.charAt(i)) {

                    pocetSpoluhlasek += 1;
                }

            }

        }
        pocetPismen = pocetSamohlasek + pocetSpoluhlasek;

        System.out.println(pocetSamohlasek);
        System.out.println(pocetSpoluhlasek);
        System.out.println(pocetPismen);
    }
}
