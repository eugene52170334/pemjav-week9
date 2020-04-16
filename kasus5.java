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
public class kasus5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("             Universitas Indonesia");
        System.out.println("               Fakultas Teknik");
        System.out.println("========================================");
        System.out.println("          Jurusan : Teknik Informatika");
        
        System.out.print("NIM Mahasiswa      : ");
        String nim = input.nextLine();
        System.out.print("Nama Mahasiswa     : ");
        String nama = input.nextLine();
        System.out.print("Kode Jurusan       : ");
        int kode = input.nextInt();
        
        
        String jurus;
        if(kode == 1){
            jurus = "Teknik Mesin";
        }else if(kode == 2){
            jurus = "Teknik Sipil";
        }else if(kode == 3){
            jurus = "Teknik Elektro";
        }else if(kode == 4){
            jurus = "Teknik Industri";
        }else{
            jurus = "Tidak Ditemukan";
        }
        
        System.out.println("Nama Jurusan     : "+jurus);
        System.out.print("Nilai Absensi      : ");
        double absen = input.nextDouble();
        System.out.print("Nilai Tugas        : ");
        double tugas = input.nextDouble();
        System.out.print("Nilai UTS          : ");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS          :");
        double uas = input.nextDouble();
        System.out.println("==============================");
        
        
        double khs = (0.20*absen)+ (0.25*tugas)+ (0.25*uts)+(0.30*uas);
        String grade="0";
        if(khs>=60){
            grade = "Lulus";
        }
        
        System.out.println("Nilai KHS : "+khs);
        System.out.println("Grade     : "+grade);
        
        
        
        //end
    }
}
