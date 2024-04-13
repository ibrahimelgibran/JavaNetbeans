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
public class ganjilGenapFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        System.out.println("Bilangan Genap");
        System.out.print("awal : ");
        awal = input.nextInt();
        System.out.print("akhir : ");
        akhir = input.nextInt();
        
        if (awal < akhir) {
        for (int i = awal; i <= akhir; i++) {
            int hasil = i % 2;
            if (hasil == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        } else {
            System.out.println("Awal > akhir");
        }
    }
}
