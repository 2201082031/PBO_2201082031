/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABDITK1B;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;


/**
 *
 * @author LABP1KOMP
 */
public class latihan772 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] angka = new int[10];
        
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Input Nilai ke---> " + (i+1) + ":");
            angka[i] = Integer.parseInt(input);
        }
        
        int max = angka[0];
        for (int i = 1; i < 10; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang dimasukkan adalah " + max);
    }
    
    
}
