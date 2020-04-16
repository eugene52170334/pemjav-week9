/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import tugasWeek5.*;

/**
 *
 * @author eugen
 */
public class bank {

    int saldo = 1000000;

    public void simpanUang(int uang) {
        saldo += uang;
        System.out.println("Saldo saat ini : " + saldo);
    }

    public void ambilUang(int uang) {
        if (saldo < uang) {
            System.out.println("Saldo Tidak Cukup");
        } else {
            saldo -= uang;
            System.out.println("Saldo saat ini : " + saldo);
        }
    }

    public void getSaldo() {
        System.out.println("saldo :" + saldo);
    }

    //end
}
