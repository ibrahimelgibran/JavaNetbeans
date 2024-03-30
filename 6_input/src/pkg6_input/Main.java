/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_input;
import java.util.Scanner;

/**
 *
 * @author elgibran17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String name; 
       System.out.print("Masukan nama : ");
       
       Scanner input = new Scanner(System.in);
       
       name = input.nextLine();
        System.out.println("Hi, " + name);
        
//       double angka; 
//       System.out.print("Masukan BB anda : ");
//       
//       Scanner input = new Scanner(System.in);
//       
//       angka = input.nextInt();
//        System.out.println("Berat Badan = " + angka + " kg");
        
       
       
    }
    
}
