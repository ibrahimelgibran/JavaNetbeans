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
public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total Belanja Anda = ");
        double total = input.nextDouble();
        System.out.println("===========================");
        System.out.println("Masukan Total Belanja Anda = " + total);
        
        if (total >= 300000) {
            System.out.println("Anda mendapatkan diskon sebesar = 15%");;
            double diskon = 15 * total / 100;
            total -= diskon;
        } else if(total >= 200000){
            System.out.println("Anda mendapatkan diskon sebesar = 10%");
            double diskon = 10 * total / 100;
            total -= diskon;
        } else if(total >= 100000){
            System.out.println("Anda mendapatkan diskon sebesar = 5%");
            double diskon = 5 * total / 100;
            total -= diskon;
        } else {
            System.out.println("Maaf, Anda tidak mendapatkan Diskon");
        }
        System.out.println("Berikut yang perlu anda bayarkan  = " +total);
    }
}
