package UKL;

import java.util.Scanner;

public class VolumeTabung {

    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double volume = Math.round(Math.PI*Math.pow(jariJari,2)*tinggi);
        return volume;
    }
     public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.println("Masukkan jari jari tabung(Radius) dalam cm: ");
        double jariJari= z.nextDouble();
        System.out.println("Masukkan tinggi tabung dalam cm: ");
        double tinggi= z.nextDouble();

        double volume = hitungVolumeTabung(jariJari,tinggi);
        
        
        System.out.println( "Volume tabung dengan jari-jari " +jariJari+ "cm dan tinggi " + tinggi + "cm adalah: "+volume);
    }
}