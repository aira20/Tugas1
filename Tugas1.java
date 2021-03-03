/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author Aria
 */
public class Tugas1 {
    /**
     * @param args the command line arguments
     */
    
 public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
int seconds = read.nextInt(); 
        int secs = seconds % 60;
        int hrs = seconds / 60;
        int mins = hrs % 60;
        hrs = hrs / 60;
        System.out.print( seconds + " seconds is " + mins + " minutes and " + secs + " seconds");
		System.out.print("\n");
    }    
 }
        // TODO code application logic here
     
