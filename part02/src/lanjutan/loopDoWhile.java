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
public class loopDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        System.out.print("awal : ");
        awal = input.nextInt();
        System.out.print("akhir : ");
        akhir = input.nextInt();
        
        int a = awal;
        do{
            System.out.print(a+" ");
            a++;
        } while (a <= akhir);
        System.out.println(" ");
    }
}
