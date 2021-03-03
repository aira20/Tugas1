/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas.pkg1;


import java.util.Scanner;
/**
 *
 * @author Aria
 */
public class Nmr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int  days, distance;

Scanner read = new Scanner(System.in);
        System.out.println("Hari ini adalah hari senin ");
        
        System.out.print("Masukan distance hari ke depan : ");
         days = read.nextInt();
        
        distance =  days % 7;
        
        if (distance == 0)
{
            System.out.println("Maka " + days + " hari berikutnya adalah hari Senin");
        }
        else if (distance == 1)
{
            System.out.println("Maka " + days + " hari berikutnya adalah hari Selasa");
        }
        else if (distance == 2)
{
            System.out.println("Maka " + days + " hari berikutnya adalah hari Rabu");
        }
        else if (distance == 3)
{
            System.out.println("Maka " + days + " hari berikutnya adalah hari Kamis");
        }
        else if (distance == 4)
{
            System.out.println("Maka " + days + " hari berikutnya adalah hari Jumat");
        }
        else if (distance == 5)
{
            System.out.println("Maka " + days + " hari berikutnya adalah hari Sabtu");
        }
        else if (distance == 6)
{
            System.out.println ("Maka " + days + " hari berikutnya adalah hari Minggu");
        }

    }

}
