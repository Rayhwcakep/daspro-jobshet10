import java.util.Arrays;
import java.util.Scanner;

public class numbers25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];
        
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("panjang baris ke-" + (i+1) + myNumbers[i].length);
        }
    }
}
