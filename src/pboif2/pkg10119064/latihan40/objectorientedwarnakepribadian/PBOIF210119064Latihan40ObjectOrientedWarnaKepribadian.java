/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan40.objectorientedwarnakepribadian;

import data.Person;
import data.Warna;
import java.util.Scanner;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk mencari kepribadian
 * seseorang berdasarkan warna favorit
 */
public class PBOIF210119064Latihan40ObjectOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //inisialisasi objek person
        Person p = new Person();
        
        //inisialisasi objek warna
        Warna w = new Warna();
        
        System.out.println("\u001b[31m" + "YUK " + "\u001b[32m" + "CEK " + "\u001b[33m" + "KEPRIBADIAN " + "\u001b[36m" + "DARI " + "\u001b[35m" + "WARNA " + "\u001b[34m" + "FAVORITMU");
        
        System.out.println("\n\u001B[41m" + "\u001B[37m" + "            MERAH            ");
        System.out.println("\u001B[42m" + "\u001B[37m" + "            HIJAU            ");
        System.out.println("\u001B[43m" + "\u001B[37m" + "            KUNING           ");
        System.out.println("\u001B[44m" + "\u001B[37m" + "            BIRU             ");
        System.out.println("\u001B[45m" + "\u001B[37m" + "            UNGU             ");
        
        //input
        System.out.println("");
        System.out.print("\u001b[0m" + "PILIH WARNA FAVORITMU : ");
        p.setWarnaFavorit(keyboard.next());
        System.out.print("\u001b[0m" + "NAMA KAMU : ");
        p.setNama(keyboard.next());
        
        w.setWarnaFavorit(p.getWarnaFavorit());
        
        //output
        System.out.println("\n====Hasil Test Kepribadian " + p.getNama() + "====");
        w.hasilTestKepribadian();
    }
    
}
