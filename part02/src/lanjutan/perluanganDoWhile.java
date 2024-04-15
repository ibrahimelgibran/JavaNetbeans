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
public class perluanganDoWhile {
    public static void main(String[] args) {
        String nama, alamat, loop;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Nama : ");
            nama = input.nextLine();
            System.out.print("alamat : ");
            alamat = input.nextLine();
            System.out.println("------------------");
            System.out.println(nama+" alamat di "+alamat);
            System.out.print("ulang (y/n) : ");
            loop = input.next();
        } while (loop.equalsIgnoreCase("y"));
        System.out.println("Program Selesai");
    }
}
