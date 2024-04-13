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
public class menuSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil, porsi, harga = 0;
        System.out.println("Menu Makanan");
        System.out.println("1. Bakso \n2. Mie Ayam");
        System.out.print("Pilih : ");
        pil = input.nextInt();
                
        switch(pil){
            case 1 -> {
                System.out.print("Porsi : ");
                porsi = input.nextInt();
                System.out.println("Bakso (5K/Porsi)");
                harga = 5000 * porsi;
                System.out.println("Total : Rp. "+harga);
            }
            case 2 -> {
                System.out.print("Porsi : ");
                porsi = input.nextInt();
                System.out.println("Mie Ayam (7K/Porsi)");
                harga = 7000 * porsi;
                System.out.println("Total : Rp. "+harga);
            }
            default -> System.out.println("Pilihan Salah");
        }
    }
}
