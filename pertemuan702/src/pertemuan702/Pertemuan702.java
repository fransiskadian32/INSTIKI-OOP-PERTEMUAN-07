

package pertemuan702;

import java.util.Scanner;

/**
 *
 * @author LAB F
 * TGL: 29-04-2025
 */
public class Pertemuan702 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String ulang="ya";
     String pil = "";
     Scanner p = new Scanner (System.in);
     
     do{
         System.out.println("Aplikasi Azalaja");
         System.out.println("1. Hitung Luas Persegi");
         System.out.println("2. Hitung Luas Segitiga");
         System.out.println("3. Selesai");
         System.out.println("1. pilih (1/2/3):");
         pil = p.nextLine();
         switch (pil) {
             case "1":
              System.out.println("Memilih MenuHitung Luas Persegi");
             
                 
                 break;
                 case "2":
              System.out.println("Memilih MenuHitung Luas Persegi");
             
                 
                 break;
                 case "3":
              ulang = "tidak";
             
                 
                 break;
             default:
                 System.out.println ("Silkan pilih 1/2/3");
                 throw new AssertionError();
         }
     }while(ulang.equals("ya"));
     System.out.println("Byeeee");
     }
    }
        


