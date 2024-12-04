package UKL;

// public class AnakMoklet {
//     public static void main(String[] args) {
//         String[] teks = {"saya anak wikusama", "saya anak moklet", "saya angkatan 33",};
//         int n = 50;

//         for (int i = n; i >= 1; i--) {
//             System.out.print(i + ". ");

//             System.out.println(teks[(i - 1) % 3]);
           
//         }

//         System.out.println("1. saya senang");
//     }
// }
public class PolaTeks {
    public static void main(String[] args) {
        for (int i = 50; i >= 2; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        }

        System.out.println("1. saya senang");
    }
}