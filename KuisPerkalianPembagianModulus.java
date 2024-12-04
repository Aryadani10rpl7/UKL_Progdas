package UKL;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class KuisPerkalianPembagianModulus {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        Random r = new Random();

        char operator;
        double bilangan1,bilangan2,jawabanBenar;
        boolean lanjut = true;

        while(lanjut){
            bilangan1 = r.nextInt(20) + 1;
            bilangan2 = r.nextInt(20) + 1;
            int operatorInt = r.nextInt(3);
            switch (operatorInt) {
                case 0:
                    operator = '*';
                    jawabanBenar = bilangan1*bilangan2;
                    break;
                 case 1:
                    operator = '/';
                    jawabanBenar = bilangan1/bilangan2;
                    break;
                case 2:
                    operator = '%';
                    jawabanBenar = bilangan1%bilangan2;
                    break;
            
                default:
                    operator= '*';
                    jawabanBenar = bilangan1*bilangan2;
                    break;

                    
            }
            
            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");

            double jawabanUser = 0;
            boolean inputValid = false;
            do {
                try {
                    jawabanUser = z.nextDouble();
                    inputValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Masukkan angka saja!");
                    z.next(); // Clear invalid input
                }
            }while (!inputValid);
            

            if(jawabanUser == jawabanBenar){
                System.out.println("Yay jawaban anda benar!");
            }else{
                System.out.println("Yah jawaban kamu salah, ini jawaban yang benar "+ jawabanBenar);
            }

            System.out.println("Apakah anda ingin melanjutkan quiz? jika ingin melanjutkan ketik 'ya' jika tidak ketik 'tidak': ");
            String pilihan = z.next();
            if(!pilihan.equalsIgnoreCase("ya")){
                lanjut=false;
                System.out.println("terimakasih ya sudah mengikuti quiz nya semoga bisa menambah pemahaman mu :)");
            } 
        }
    }
}
