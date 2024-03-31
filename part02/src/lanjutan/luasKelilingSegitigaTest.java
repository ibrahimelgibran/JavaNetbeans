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
public class luasKelilingSegitigaTest {
    public static void main(String[] args) {
        /*
        Segitiga sama kali
        Luas, Keliling, Alas, Tinggi, Sisi-Sisi
        L = 0.5 * (a * t)
        K = s + s + s
        */
        Scanner input = new Scanner(System.in);
        double L, K, a, t, s;
        System.out.print("Masukan Alas : ");
        a = input.nextDouble();
        System.out.print("Masukan Tinggi : ");
        t = input.nextDouble();
        
        // berikan valuenya
        s = a;
        L = 0.5 * (a * t);
        K = s + s + s;
        
        System.out.println("Luas = " + L);
        System.out.println("Keliling = " + K);
    }
}
