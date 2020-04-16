/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week9;

import tugasWeek5.*;
import java.util.Scanner;

/**
 *
 * @author eugen
 */
public class bankBeraksi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int uang;
    bank aksi = new bank();
    
        System.out.println("Selamat datang di bank ABC");
        System.out.println("Saldo saat ini : "+aksi.saldo);
        
        System.out.println("1. Setor Uang");
        System.out.println("2. Tarik Uang");
        System.out.println("3. Cek Saldo");
        System.out.print("pilih ? ");
        
        int pilih = input.nextInt();
        
        switch (pilih){
            case 1:
                System.out.print("Simpan uang : ");uang = input.nextInt();
                aksi.simpanUang(uang);
                break;
            case 2:
                System.out.print("ambil uang : ");uang = input.nextInt();
                aksi.ambilUang(uang);    
                break;
            case 3:
                aksi.getSaldo();
        }
        aksi.getSaldo();
        
    //end
    }
}
