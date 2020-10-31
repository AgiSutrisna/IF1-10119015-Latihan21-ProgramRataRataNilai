/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rrt = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print("Masukan banyaknya mahasiswa :");
        n = rrt.nextInt();
        jum = 0;
        i = 1;
        while (i<=n){
            System.out.print("Nilai Mahasiswa ke-"+i+": ");
            x = rrt.nextFloat();
            jum += x;
            i++;
        }
        rata = jum / n;
        System.out.println("Maka, Rata-rata nilainya adalah: "+rata);
        System.out.println("Deployed by : Agi Sutrisna");
    }
    
}
