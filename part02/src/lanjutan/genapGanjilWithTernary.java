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
public class genapGanjilWithTernary {
    /*
    Menentukan Genap dan Ganjil 
    Use Modelus atau Sisa Bagi dengan operator Ternary % 
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Deseksi Angka Genap or Ganjil = ");        
        int angka = input.nextInt();
        int hasil = angka % 2;
        
        String kondisi = hasil == 0?"Genap":"Ganjil";
        System.out.println(kondisi);
        
    }
}
