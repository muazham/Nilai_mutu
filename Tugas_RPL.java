/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_rpl;
import java.util.Scanner;

/**
 *
 * @author MyBook Hype AMD
 */
public class Tugas_RPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Scanner input = new Scanner(System.in);
          
            System.out.println("===Menu paket Makanan ===");
            System.out.println("1. paket Ayam - Rp. 15.000");
            System.out.println("2. paket Ikan - Rp. 20.000");
            System.out.println("3. paket Daging - Rp. 30.000");
            System.out.println("4. paket sayaur - Rp. 10.000");
            System.out.print("Pilih paket (1-4): ");
            int pilihan = input.nextInt();
            
            int harga = 0;
            String paket = "";
            
             switch (pilihan) {
                 case 1:
                     paket = "paket Ayam";
                     harga = 15000;
                     break;
                 case 2:
                     paket = "paket Ikan";
                     harga = 20000;
                     break;
                 case 3:
                     paket = "paket Daging";
                     harga = 30000;
                     harga -=5000; //potongan harga Rp.5000
                     break;
                 case 4:
                     paket = "paket Sayur";
                     harga = 10000;
                     break;
                     default:
                     System.out.println("pilihan tidak tersedia.");
                     return;//keluar dari program jika pilihan tidak valid{
             }
             
             System.out.println("Anda memilih:"+paket);
             System.out.println("Total Harga:Rp."+harga);
        }
    }
    

