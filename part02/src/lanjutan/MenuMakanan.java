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
public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, harga=0, porsi;
        String menu = null;
        System.out.println("--- Menu Makanan---");
        System.out.println("1. Bakso\n2. Mie Ayam\n3. Soto");
        System.out.print("Pilihan \t: ");
        pilihan = input.nextInt();
        
        // percabangan
        if (pilihan == 1) {
            menu = "Bakso";
            harga = 8000;
        } else if (pilihan == 2){
            menu = "Mie Ayam";
            harga = 9000;
        } else if (pilihan == 3) {
            menu = "Soto";
            harga = 10000;
        }
        if (menu == null ) {
            System.out.println("Pilihan Salah ");
        } else {
        System.out.print("Jumlah Porsi \t: ");
        porsi = input.nextInt();
        System.out.println("=====================");
        System.out.println("Menu Pesanan : ");
        System.out.println(menu+" - Rp. "+harga+"/Porsi");
        harga = harga * porsi;
        System.out.println("Total Bayar : Rp. "+harga);
        }  
    }
}
