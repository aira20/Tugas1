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
    public static void main(String[] args) {
Scanner read = new Scanner(System.in);
int minutes, seconds;
System.out.print("Enter an Integer for seconds: ");
seconds = read.nextInt();
minutes = seconds/60;

System.out.println(seconds + " seconds is " + minutes + "minutes and " + seconds % 60 + " seconds");
        // TODO code application logic here
    }
} 
