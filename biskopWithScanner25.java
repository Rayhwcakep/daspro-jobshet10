import java.util.Scanner;

public class biskopWithScanner25 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

      int baris,kolom;
      String nama,next;
      
      String [][] penonton = new String[4][2];
            
      while (true) {
          System.out.println("\n============ Menu ============");
          System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama = input.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();
                    
                    if (baris >= 1 && baris < 4 && kolom >= 1 && kolom <= 2) {
                        
                        if (penonton[baris - 1][kolom -1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Kursi berhasil dipesan untuk " + nama);
                            break; 
                        } else {
                            System.out.println("Kursi tersebut sudah terisi oleh " + penonton[baris -1 ][kolom - 1] + ". Pilih kursi lainnya.");
                        }
                    } else {
                        System.out.println("Nomor baris atau kolom tidak valid. Silakan masukkan ulang.");
                    }
                    break;
                case 2:
                System.out.println("\n============ Daftar Penonton ============");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String penontonNama = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.println("Penonton baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ": " + penontonNama);
                        }
                    }
                    break;

                case 3:

                    System.out.println("Keluar dari program.");
                    input.close();
                    return;
                
                default:
                    System.out.println("tidak valid. Silakan coba lagi.");
                }
            }
        }
    }
