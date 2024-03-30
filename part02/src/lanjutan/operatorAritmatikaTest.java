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
public class operatorAritmatikaTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.print("Masukan a : ");
        a = input.nextInt();
        
        System.out.print("Masukan b : ");
        b = input.nextInt();
        
        c = a + b;
        System.out.print(a + " + " + b + " = ");
        System.out.println(c);
        
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        
        c = a / b;
        System.out.println(a + " : " + b + " = " + c);
        
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);   
    }
    
}
