package UKL;

import java.util.Scanner;

public class BiayaTotalPengiriman {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Berapa berat paket? (Kg): ");
        double beratPaket= i.nextDouble();
        System.out.println("Berapa Jarak tempuh paket? (Km): ");
        double jarakTempuh= i.nextDouble();
        System.out.println("Berapa panjang paket ? (cm): ");
        double panjangPaket= i.nextDouble();
        System.out.println("Berapa lebar paket ? (cm): ");
        double lebarPaket= i.nextDouble();
        System.out.println("Berapa tinggi paket ? (cm): ");
        double tinggiPaket= i.nextDouble();

        double volume = panjangPaket*lebarPaket*tinggiPaket;

        double biayaJarakTempuh;
        if(jarakTempuh<=10){
           biayaJarakTempuh = beratPaket*4250;
        }else{
            biayaJarakTempuh = beratPaket*6000;
        }

        double biayaVolumePaket = 0;
        if(volume > 100){
            biayaVolumePaket = 50000;
        }

        double biayaTotal = biayaJarakTempuh+biayaVolumePaket;
        
        System.out.println("Biaya total pengiriman paket: "+ biayaTotal);
     }
}
