import java.util.Scanner;

public class IndexSplitPriemer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Výpočet průměru známek");
        System.out.println("Zadejte známky oddělené čárkou:");
        String s = sc.nextLine();

        float[] cisla2 = {1, 2, 3, 4, 5};
        float cislo = 0;
        float spolu = 0;
        int index = -1;
        float priemer = 0;
        String[] znamky = s.split(",");
        String[] cisla = {"1", "2", "3", "4", "5"};

        for (String znamka : znamky) {
            for (int i = 0; i < cisla.length; i++) {
                if (cisla[i].equals(znamka)) {
                    index = i;
                }
                if (index >= 0) {
                    cislo = cisla2[index];
                }
            }
            spolu += cislo;
        }
        priemer = (float) spolu / znamky.length;
        System.out.println("Priemer :" + priemer);

       for ( String znamka : znamky){
            spolu += Float.parseFloat(znamka);
        }
        priemer = spolu/znamky.length;
        System.out.println(priemer);
    }
}
