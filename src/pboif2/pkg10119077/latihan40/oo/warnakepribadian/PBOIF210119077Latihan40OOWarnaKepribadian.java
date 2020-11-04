/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan40.oo.warnakepribadian;

import java.util.Scanner;
import data.warna;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: WarnaKepribadian (OO)
 */
public class PBOIF210119077Latihan40OOWarnaKepribadian {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        warna color = new warna();
        String warna,nama;
        
        System.out.println(color.RED+"YUK"+color.GREEN+" CEK"+color.YELLOW+" KEPRIBADIANMU"+color.CYAN+" DARI"+color.PURPLE+" WARNA"+color.BLUE+" FAVORITMU");
        System.out.println("\n\u001B[41m" + "\u001B[37m" + "            MERAH            ");
        System.out.println("\u001B[42m" + "\u001B[37m" + "            HIJAU            ");
        System.out.println("\u001B[43m" + "\u001B[37m" + "            KUNING           ");
        System.out.println("\u001B[44m" + "\u001B[37m" + "            BIRU             ");
        System.out.println("\u001B[45m" + "\u001B[37m" + "            UNGU             ");
        System.out.println(color.BLACK+"");
        System.out.println("*gunakan huruf kapital");
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        System.out.print("NAMA KAMU : ");
        nama = input.next();
        color.kepribadian(warna, nama);
    }
    
}
