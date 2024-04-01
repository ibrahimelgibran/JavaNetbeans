/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanjutan;
import java.util.Scanner;
/**
 *
 * @author elgibran17
 */
public class percabanganBersarangIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga = 0, diskon = 0;
        int pilihan, porsi;
        String menu = null;
        
        // mulai study case
        System.out.println("--- Aneka Bakso ---");
        System.out.println("1. Lokal\n2. Luar Negri");
        System.out.print("Pilih \t: ");
        pilihan = input.nextInt();
        System.out.print("Porsi \t: ");
        porsi = input.nextInt();
        
        // percabaungan kondisi
        if (pilihan == 1) {
            menu = "Bakso Lokal";
            harga = 8000;
            if (porsi >= 10) {
                diskon = 10 * (harga * porsi)/100;
                System.out.println("Diskon 15% - Rp. "+diskon);
            } else {
                System.out.println("Diskon 15%, min 10 porsi");
            }
        } else if (pilihan == 2) {
            menu = "Bakso Luar Negri";
            harga = 9000;
            if (porsi >= 5) {
                diskon = 10 * (harga * porsi) /100;
                System.out.println("Diskon 10% - Rp. "+diskon);
            } else{
                System.out.println("Diskon 10%, min 5 porsi");
            }
        }
        System.out.println("==================");
        System.out.println("Menu Pilihan :");
        System.out.println(menu+" - Rp. "+harga+"/porsi");
        harga = (harga * porsi) - diskon;
        System.out.println("Total Bayar = Rp. "+harga);
        
    }
   
}
