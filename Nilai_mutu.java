/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai_mutu;

import java.util.Scanner;

/**
 *
 * @author MyBook Hype AMD
 */
public class Nilai_mutu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        Scanner input= new Scanner (System.in);
        System.out.println("masukan nulai kamu=");
        
        nilai=input.nextInt();
        if(nilai >=90 && nilai <=100){
            System.out.println("A");
        }
        else if(nilai >=80 && nilai <=89){
            System.out.println("B");
        }
        else if(nilai >=70 && nilai <=79){
            System.out.println("c");
        }
        else if(nilai >=60 && nilai <=69){
            System.out.println("D");
        }
        else if(nilai >=50 && nilai <=59){
            System.out.println("E");
        }
        else
            System.out.println("F");
        
    }
    
}
