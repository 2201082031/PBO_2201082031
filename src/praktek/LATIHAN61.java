/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABDITK1B;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LABP1KOMP
 */
public class LATIHAN61 {
     public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter exam1 score: ");
        double exam1 = Double.parseDouble(reader.readLine());

        System.out.print("Enter exam2 score: ");
        double exam2 = Double.parseDouble(reader.readLine());

        System.out.print("Enter exam3 score: ");
        double exam3 = Double.parseDouble(reader.readLine());

        double average = (exam1 + exam2 + exam3) / 3.0;

        System.out.println("Average score: " + average);

        if (average >= 60.0) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}

