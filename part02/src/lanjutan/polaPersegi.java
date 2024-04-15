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
public class polaPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int jml = input.nextInt();
        for (int i = 1; i <= jml; i++) {
            for (int j = 1; j < jml; j++) {
                System.out.print("o  ");
            }
            System.out.println("o  ");
        }
        System.out.println("");
    }
}
