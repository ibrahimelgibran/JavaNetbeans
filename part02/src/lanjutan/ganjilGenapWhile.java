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
public class ganjilGenapWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir, split;
        System.out.println("Bilangan Genap");
        System.out.print("Awal : ");
        awal = input.nextInt();
        System.out.print("Akhir : ");
        akhir = input.nextInt();
       
        if (awal > akhir) {
            System.out.println("Inputan salah");
        } else {
            int a = awal;
        split = 1;
        while (a <= akhir){
            int hasil = a % 2;
            if (hasil == 1) {
                System.out.print(a+" ");
                if (split == 5) {
                    System.out.println(" ");
                    split = 0;
                }
                split++;
            }
            a++;
          }
        }
        System.out.println(" ");
    }
}
