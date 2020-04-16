/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Scanner;

/**
 *
 * @author eugene bryan lee
 */
public class kasus3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("                TOKO SERBA ADA");
        System.out.println("   jl. Bantar gebang no. 23 Bekasi Jawa Barat");
        System.out.println("==============================================");
        System.out.print("Nama Barang        : ");
        String nama = input.nextLine();
        System.out.print("Harga Barang       : ");
        double harga = input.nextDouble();
        System.out.print("Jumlah Barang      : ");
        double qty = input.nextDouble();
        System.out.println("============================");
        
        
        double subTot = harga * qty;
        double disc;
        
        if(subTot >=500000){
            disc = 0.10* subTot;
        }else if(subTot >=300000){
            disc = 0.06* subTot;
        }else if(subTot >=150000){
            disc = 0.03* subTot;
        }else if(subTot >=100000){
            disc = 0.01* subTot;
        }else{
            disc = 0;
        }
        double total = subTot-disc;
        
        System.out.println("Total Belanja      : "+ subTot);
        System.out.println("Potongan Harga     : "+ disc);
        System.out.println("==============================");
        System.out.println("Total Harga        : "+ total);
        System.out.print("Uang Bayar          : ");double bayar = input.nextDouble();
        System.out.println("==============================");
        double kembali = bayar - total;
        System.out.println("Uang Kembali      :"+ kembali);

        //end
    }
}
