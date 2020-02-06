public class Arrays2D {

    public static void main(String[] args) {

        int[][] card = {{1, 2, 3, 4}, {5, 6, 7}};

        System.out.println(card[0][0]);


        int[][] card2 = {{1, 2, 3,},
                         {4, 5, 6,},
                         {7, 8, 9}};

        System.out.println(card2[0][0]);


        int[][] card3 = new int[3][3];
        card3[0][0] = 1;
        card3[0][1] = 2;
        card3[0][2] = 3;
        card3[1][0] = 4;
        card3[1][1] = 5;
        card3[1][2] = 6;
        card3[2][0] = 7;
        card3[2][1] = 8;
        card3[2][2] = 9;

        System.out.println(card3[0][0]);


        for (int i = 0; i < 3; i++) {
            for (int h = 0; h < 3; h++)
                System.out.println(card2[i][h]);
        }
    }
}
