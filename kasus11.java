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
public class kasus11 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun : ");
        int tahun = i.nextInt();
        System.out.print("Masukkan Bulan : ");
        int bulan = i.nextInt();
        
        int kabisat = tahun%400;
        int kabisat2  =tahun%4;
        int kabisat3 = tahun%100;
        if(kabisat == 0 ){
            if(kabisat2 == 0){
                if(kabisat3 != 0){
                    System.out.println("Jumlah hari pada tahun "+tahun+" bulan "+bulan+" adalah 29 hari" );
                }
            }
            
        }else{
            System.out.println("Jumlah hari pada tahun "+tahun+" bulan "+bulan+" adalah 28 hari" );
        }
        
        
        
        
        //end
    }
}
