/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118080.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program input dan output nama
 */
public class PBO10118080Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan Nama Anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah "+nama);
    }
    
}
