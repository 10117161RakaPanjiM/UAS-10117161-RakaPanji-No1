/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pkg10117161.rakapanji.no1;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 */
public class UTS10117161RakapanjiNo1 {

    /**
     * @param args the command line arguments
     * NAMA: Raka Panji Muhabieq
     * KELAS: PBO1
     * NIM: 10117161
     */
    public static void main(String[] args) {
       // TODO code application logic here
         Scanner scan = new Scanner(System.in);

        Age objAge = new Age(2020);
        System.out.print("Masukan tahun Lahir Anda : ");
        objAge.setYearBirth(scan.nextInt());
        System.out.println("");

        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda " + objAge.getYearBirth());
        System.out.println("Hari ini Tahun : " + objAge.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "
                + objAge.hitungUmur() + " tahun ");
        System.out.println("Tandanya Kamu "
                + objAge.tandanyaKamu(objAge.hitungUmur()));
    }
    
}