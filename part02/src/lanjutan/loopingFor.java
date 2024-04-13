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
public class loopingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        System.out.println("Range Angka");
        System.out.print("Awal : ");
        awal = input.nextInt();
        System.out.print("Akhir : ");
        akhir = input.nextInt();
        
        for (int i = awal; i <= akhir; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
