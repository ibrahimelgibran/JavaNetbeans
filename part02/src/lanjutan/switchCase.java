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
public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan (L/P) : ");
        String pil = input.nextLine();
        
        switch(pil){
            case "L", "l":
                System.out.println("Laki-Laki");
                break;
            case "P", "p":
                System.out.println("Perempuan");
                break;
            default:
                System.out.println("Pil Salah");
                break;
        }
    }
}
