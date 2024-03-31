/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanjutan;

/**
 *
 * @author elgibran17
 */
public class IncrementDecrement {
    //Increment
    /*
    Post Increment = a++
    Pre Increment = ++a
    
    Post Decrement = a--
    Pre Decrement = --a
    */
    //Decrement
    public static void main(String[] args) {
        
        int a;
        int i = 5;
        a = i++;
        
        /*
        Post = a = i; i = i + 1;
        Pre = i = i + 1; a = i;
        */
        
        System.out.println(a);
        System.out.println(i);
     
        
    }
    
}
