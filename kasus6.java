/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author eugen
 */
import java.util.Scanner;

public class kasus6 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan Nama Karyawan            : ");
         String nama = input.nextLine();
         System.out.print("Masukkan Golongan Karyawan        : ");
         int gol = input.nextInt();
         System.out.print("Masukkan Tahun Kerja Karyawan    : ");
         int thn = input.nextInt();
         
         int gapok=0;
         if(gol == 1){
             gapok = 1500000;
         }else if(gol == 2){
             gapok = 1200000;
         }else if(gol == 3){
             gapok = 1000000;
         }else if( gol == 4){
             gapok = 700000;
         }
         int masa = 2017-thn;
         int bonus=0;
         if( masa >= 5){
             bonus = 800000;
         }else{
             bonus = 0;
         }
         int total = gapok + bonus;
         System.out.println("Golongan Karyawan        : "+ gol);
         System.out.println("Gaji Pokok Karyawan      : "+ gapok);
         System.out.println("Tahun Masuk Kerja        : "+ thn);
         System.out.println("Masa Kerja Karyawan      : "+ masa);
         System.out.println("Bonus Karyawan           : "+ bonus);
         System.out.println("Gaji Karyawan            : "+ total);
         
         
         
         
         //end
    }
}
