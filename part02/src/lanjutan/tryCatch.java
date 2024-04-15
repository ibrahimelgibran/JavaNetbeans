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
public class tryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        String ulang;
        do {
            System.out.print("masukkan x = ");
            x = input.nextInt();
            System.out.print("masukkan y = ");
            y = input.nextInt();
            System.out.println("=============");
            try{
                z = x / y;
                System.out.println("hasil "+z);
            }catch(Exception e) {
                System.out.println("pembagian salah");
                System.out.println("error : ");
                e.printStackTrace();
            }
            System.out.print("ulang [y/n]");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("y"));
        System.out.println("================");
        System.out.println("Program Selesai");
    }
}
