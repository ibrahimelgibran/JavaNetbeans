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
public class predikatIfElse {
    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
        String predikat = null;
        if (nilai <= 0) {
            predikat = "Salah Inputkan Nilai";
        } else if (nilai > 100) {
            predikat = "Nilai Overload";
        } else if (nilai >= 80) {
            predikat = "Amat Baik";
        } else if (nilai >= 70) {
            predikat = "Baik";
        } else if (nilai >= 60) {
            predikat = "Cukup";
        } else if (nilai >= 50) {
            predikat = "Kurang";
        } else{
            predikat = "Belajar Lagi";
        }
        System.out.println("==============================");
        System.out.println("=========== OUTPUT ===========");
        System.out.println("==============================");
        System.out.println("Nilai \t    \t: " +nilai);
        System.out.println("Predikat \t: " +predikat);
    }
}
