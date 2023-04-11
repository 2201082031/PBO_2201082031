/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABDITK1B;

/**
 *
 * @author LABP1KOMP
 */
public class ARITMATIKASATU {
      
    public int tambah(int a, int b){
        return a+b;
    }
    
    public boolean cekGanjil(int a){
        return (a%2 == 1);
    }
    
    
                  
    public static void main(String[] args){
        ARITMATIKASATU aritmatika = new ARITMATIKASATU();
        int c = aritmatika.tambah(12,7);
        System.out.println("Nilai C = "+c);
        System.out.println("Ganjil ?"+aritmatika.cekGanjil(c));
        
    }
}

    

