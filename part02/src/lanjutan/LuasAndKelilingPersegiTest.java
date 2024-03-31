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
public class LuasAndKelilingPersegiTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Sisi, Luas, Keliling;
        System.out.print("Inputkan Sisi : ");
        Sisi = input.nextInt();
        Luas = Sisi * Sisi;
        Keliling = 4 * Sisi;
        
        // Narasi Luas Persegi
        System.out.println("\nLuas Persegi = Sisi * Sisi");
        System.out.println("Luas Persegi = " +Sisi+ " * " + Sisi);
        System.out.println("Luas Persegi = " + Luas + "\n");
        
        System.out.println("Keliling Persegi = 4 * Sisi");
        System.out.println("Keliling Persegi = 4" + " * " + Sisi);
        System.out.println("Keliling Persegi = " + Keliling);
                
    }
    
}
