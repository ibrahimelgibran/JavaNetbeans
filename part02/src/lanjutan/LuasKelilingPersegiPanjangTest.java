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
public class LuasKelilingPersegiPanjangTest {
    public static void main(String[] args) {
       /*
        Luas persegi panjang = Panjang * Lebar
        Keliling persegi panjang = 2 * (p + l)
        */
        Scanner input = new Scanner(System.in);
        int panjang, lebar, Luas, Keliling;
        System.out.print("Masukan Panjang = ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar = ");
        lebar = input.nextInt();
        
        Luas = panjang * lebar;
        Keliling = 2 * (panjang + lebar);
        
        System.out.println("Luas = Panjang * Lebar");
        System.out.println("luas = "+panjang+ " * " + lebar);
        System.out.print("Luas = ");
        System.out.println(Luas);
        
        System.out.println("Keliling = 2 Panjang * Lebar");
        System.out.println("Keliling = 2 * ("+panjang+" + "+lebar+")");
        System.out.print("Keliling = ");
        System.out.println(Keliling);
        
        
        
    }
}
