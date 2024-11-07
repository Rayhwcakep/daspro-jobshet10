import java.util.Scanner;
import java.util.Arrays;

public class SIAKAD25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rata=0;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahperMatkul = input.nextInt();
        int [][] nilai = new int[jumlahMahasiswa][jumlahperMatkul];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa=0;
            
            
            for (int j = 0; j < jumlahMahasiswa; j++) {
                System.out.print(" nilai mata kuliah" + (j+1) + ": ");
            nilai[i][j] = input.nextInt();
            totalPerSiswa += nilai[i][j];
        }
        System.out.println("nilai rata-rata: " +  (i+1)  + " = " + (totalPerSiswa/jumlahperMatkul));

        }
        System.out.println("\n=====================================");
        System.out.println("rata-rata nilai setiap mata kuliah: ");
        
        for  (int j = 0; j < 3; j++) {
            double totalperMatkul = 0;
            
            for (int  i = 0; i < 4; i++) {
                totalperMatkul += nilai[i][j];
            }
            System.out.println("mata kuliah" +  (j+1)  + ": " + totalperMatkul/4);
            
        }
    }
}
