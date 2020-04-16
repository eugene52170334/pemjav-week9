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
public class kasus4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("             Kwik Kian Gie");
        System.out.println("           NIlai Akhir Semester");
        System.out.println("========================================");
        System.out.println("       Jurusan : Teknik Informatika");
        
        System.out.print("Nama Mahasiswa     : ");
        String nama = input.nextLine();
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
        String grade;
        if(khs>=80){
            grade = "A";
        }else if(khs>=66){
            grade = "B";
        }else if(khs >=56){
            grade = "C";
        }else if(khs >=56){
            grade = "D";
        }else{
            grade = "E";
        }
        
        System.out.println("Nilai KHS : "+khs);
        System.out.println("Grade     : "+grade);
        
        
        
        //end
    }
}
