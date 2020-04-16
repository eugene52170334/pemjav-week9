/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Scanner;

/**
 *
 * @author eugen
 */
public class kasus8 {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.println("Menghitung Luas dan Keliling Persegi Panjang");

        System.out.print("Masukkan Panjang : ");
        double p = i.nextDouble();
        System.out.print("Masukkan Lebar : ");
        double l = i.nextDouble();

        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Masukkan Pilihan: ");
        int pilih = i.nextInt();

        double hasil;
        switch (pilih) {
            case 1:
                hasil = p * l;
                System.out.println("Luas persegi Panjang : " + hasil);
                break;
            case 2:
                hasil = 2 * (p + l);
                System.out.println("Keliling Persegi Panjang : " + hasil);
        }

    }

}
