/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABDITK1B;
import java.util.Scanner;

/**
 *
 * @author LABP1KOMP
 */
public class LATIHAN642 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int angka, pangkat;
        
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        
        System.out.print("Masukkan pangkat: ");
        pangkat = input.nextInt();
        
        int hasil = 1;
        int i = 1;
        if (pangkat == 0) {
            hasil = 1;
        } else {
            do {
                hasil *= angka;
                i++;
            } while (i <= pangkat);
        }
        System.out.println("Hasil " + angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}

