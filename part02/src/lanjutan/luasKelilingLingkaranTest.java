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
public class luasKelilingLingkaranTest {
    public static void main(String[] args) {
        /*
        Luas = phi * r * r (jadi r itu jari-jari)
        Keliling = phi * diameter
        diameter = 2 * r
        */
        Scanner input = new Scanner(System.in);
        final double phi = 3.14;
        double L, K, r, d;
        System.out.print("Masukan R Jari-Jari : ");
        r = input.nextDouble();
        d = 2 * r;
        
        L = phi * r * r;
        K = phi * d;
        
        System.out.println("Luas= " + L);
        System.out.println("Keliling = " + K);
        
        
        
    }
}
