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
public class operatorTernary {
    public static void main(String[] args) {
    /*
        [Data-Type] name = value?"diperlobelhkan":"tidk diperbolehkan"
    */
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan nilai : ");
    int nilai = input.nextInt();
    int kkm = 75;
    
    String hasil = nilai >= kkm?"Lulus":"Tidak Lulus";
    System.out.println("Nilai Anda = " + nilai);
    System.out.println("Anda dinyatakan = " + hasil);
   
    
    }
}
