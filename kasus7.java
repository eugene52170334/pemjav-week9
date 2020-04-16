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
public class kasus7 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan NIM  : ");
        String nim = i.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = i.nextLine();
        System.out.println("Pilihan:");
        System.out.println("1. Sistem Informasi");
        System.out.println("2. Teknik Industri");
        System.out.println("3. Teknik Informatika");
        System.out.print("Masukkan pilihan: ");
        int pilih = i.nextInt();
        
        String jurus ="";
        switch (pilih){
            case 1:
                jurus = "Sistem Informasi";
                break;
            case 2:
                jurus = "Teknik Industri";
                break;
            case 3:
                jurus = "Teknik Informatika";
                break;
        }
        
        System.out.println(nama +" dengan nim "+nim+" memilih jurusan "+jurus);
        
        
        
     
        
        
        //end
    }
}
