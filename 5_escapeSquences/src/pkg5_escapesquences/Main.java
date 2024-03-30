/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_escapesquences;

/**
 *
 * @author elgibran17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Ibrahim El Gibran";
        int age = 20;
        double beratBadan = 59.5;
        
        /*
          \t -> tab
          \n -> enter
          \b -> backspace
        */
       
        System.out.print("Nama \t\t= " + name + "\nUmur \t\t= " + age + " Tahun\n");
        System.out.println("Berat Badan \t= " + beratBadan + " kg");
    }
    
}
