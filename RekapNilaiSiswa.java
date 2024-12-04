package UKL;

import java.util.Scanner;

public class RekapNilaiSiswa {
    public static void main(String[] args) {
         Scanner z = new Scanner(System.in);

         System.out.println("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = z.nextInt();

        double [] nilaiSiswa = new double[jumlahSiswa];
        
        for(int i = 0; i<jumlahSiswa; i++){
            System.out.println("Masukkan Nilai Siswa ke-"+(i+1)+(": "));
             nilaiSiswa[i] = z.nextDouble();
        }

        double nilaiTotal = 0;
        for(double nilai:nilaiSiswa){
            nilaiTotal+=nilai;
        }

        double rataRata= nilaiTotal/jumlahSiswa;
        System.out.println("Rata-rata nilai ujian Produktif RPL sebagai Berikut: "+rataRata);
    }
}
