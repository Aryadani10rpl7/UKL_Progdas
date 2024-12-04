package UKL;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenghitungFrekuensiArray {
    public static void main(String[] args) {
       Scanner z = new Scanner(System.in);
       
       System.out.println("Masukkan ukuran array: ");
       int ukuran = z.nextInt();

       int[] arr = new int[ukuran];

       System.out.println("Masukkan angka array: ");
       for (int i = 0; i < ukuran; i++){
        arr[i] = z.nextInt();
       }

       Map<Integer, Integer> frekuensi = new HashMap<>();
       for (int num : arr){
        frekuensi.put(num, frekuensi.getOrDefault(num, 0)+1);
       }

       for(Map.Entry<Integer, Integer> entry: frekuensi.entrySet()){
        System.out.println(entry.getKey()+" muncul "+entry.getValue()+" kali");
       }
    }
}
