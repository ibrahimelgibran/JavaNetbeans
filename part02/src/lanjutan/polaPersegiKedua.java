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
public class polaPersegiKedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka  : ");
        int jml = input.nextInt();
        System.out.println("--------------");
        System.out.println("--- output ---");
        System.out.println("--------------");
        for (int i = 1; i <= jml; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("o ");
            }
            System.out.println("o ");
        }
        System.out.println("");
    }
}
