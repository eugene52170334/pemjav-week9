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
public class kasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah Pendapatan Sales: ");
        double uang = input.nextDouble();
        double jasa=0, komisi=0;
        
        if(uang <=200000){
            jasa = 10000;
            komisi = 0.10 * uang;
        }else if(uang <=500000){
            jasa = 20000;
            komisi = 0.15 * uang;
        }else{
            jasa = 30000;
            komisi = 0.20 * uang;
        }
        double total  = jasa + komisi;
        System.out.println("");
        System.out.println("Uang Jasa  : " + jasa);
        System.out.println("Uang Komisi: " + komisi);
        System.out.println("===========================");
        System.out.print("total = "+ total);
        
        
        
        
        
        
        //end
    }
    
}
