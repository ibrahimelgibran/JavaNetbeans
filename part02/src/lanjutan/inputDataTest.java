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
public class inputDataTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, address;
        int age;
        
        System.out.print("Name \t: ");
        name = input.nextLine();
        System.out.print("Address : ");
        address = input.nextLine();
        System.out.print("Age \t: ");
        age = input.nextInt();
        System.out.println("==============================");
        System.out.println("Nama saya " + name + " Lahir di " + address);
        System.out.println("Berumur " + age + " Tahun");
             
             
    }
    
}
