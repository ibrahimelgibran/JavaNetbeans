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
public class pangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, pangkat, hasil;
        System.out.print("bilangan : ");
        bil = input.nextInt();
        System.out.print("pangkat : ");
        pangkat = input.nextInt();
        System.out.print("hasil : ");
        hasil = bil;
        for (int i = 1; i < pangkat; i++) {
            hasil *= bil;
        }
        System.out.println(hasil);
    }
}
