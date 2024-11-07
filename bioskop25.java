import java.util.Scanner;

public class bioskop25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [][] penonton = new String[4][2];

        penonton [0][0] = "ray";
        penonton [0][1] = "ibnush";
        penonton [1][0] = "sandy";
        penonton [1][1] = "aldit";
        penonton [2][0] = "rafi";
        penonton [2][1] = "dafa";
        penonton [3][0] = "qulbi";
        penonton [3][1] = "marcel";

        System.out.printf("%s \t %s\n",  penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n",  penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n",  penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n",  penonton[3][0], penonton[3][1]);

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("penonton baris ke- " + (i+1) + " : " + String.join(",", penonton[i]));

        }
    }
}