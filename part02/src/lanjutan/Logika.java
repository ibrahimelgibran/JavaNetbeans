/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanjutan;

/**
 *
 * @author elgibran17
 */
public class Logika {
    public static void main(String[] args) {
       // Operator Logika 
       /*
       NOT (tidak) = ! tipenya boolean true 1 - false 0
       AND (dan)   = &&
       OR (atau)   = ||
       */
       
       // not
       boolean lulus = false;
       boolean hasil = !lulus;
       System.out.println(hasil);
       
       System.out.println("=========================");
       // and 
       boolean  a = true; // true = 1
       boolean  b = false; // false = 0
       boolean  c = a && b;
       System.out.println(c);
       
       System.out.println("=========================");
       // or ||
       boolean  d = true; // true = 1
       boolean  e = false; // false = 0
       boolean  f = d || e;
       System.out.println(f);
       
       
    }
}
