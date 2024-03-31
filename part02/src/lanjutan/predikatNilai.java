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
public class predikatNilai {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukin Nilai : ");
        int nilai = input.nextInt();
        String predikat =
                nilai > 100 ? "Nilai Salah" :
                nilai >= 80 ? "Sangat Baik" :
                nilai >= 60 ? "Baik" :
                nilai >= 40 ? "Cukup" :
                nilai >= 20 ? "Bad" :
                nilai <= -1 ? "Nilai tidak boleh - negatif" :
                "Belajar Lagi";
        System.out.println("Nilai anda = " + predikat);
               
    }
}
