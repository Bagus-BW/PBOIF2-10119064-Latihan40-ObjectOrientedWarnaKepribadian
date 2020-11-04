/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk mencari kepribadian
 * seseorang berdasarkan warna favorit
 */
public class Warna extends Person{
    
    private void setMerah(){
        System.out.println("\u001b[0m" + "Warna Favoritmu adalah " + "\u001b[31m" + getWarnaFavorit());
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");   
    }
    
    private void setHijau(){
        System.out.println("\u001b[0m" + "Warna Favoritmu adalah " + "\u001b[32m" + getWarnaFavorit());
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri");
        System.out.println("7. menjunjung tinggi suatu nilai toleransi dan kepercayaan.");   
    }
    
    private void setKuning(){
        System.out.println("\u001b[0m" + "Warna Favoritmu adalah " + "\u001b[33m" + getWarnaFavorit());
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }
    
    private void setBiru(){
        System.out.println("\u001b[0m" + "Warna Favoritmu adalah " + "\u001b[34m" + getWarnaFavorit());
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }
    
    private void setUngu(){
        System.out.println("\u001b[0m" + "Warna Favoritmu adalah " + "\u001b[35m" + getWarnaFavorit());
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
    }
    
    public void hasilTestKepribadian(){
        //convert menjadi huruf besar
        String kalimatUpper = getWarnaFavorit().toUpperCase();
        
        switch(kalimatUpper){
            case "MERAH":
                setMerah();
                break;
            case "HIJAU":
                setHijau();
                break;
            case "KUNING":
                setKuning();
                break;
            case "BIRU":
                setBiru();
                break;
            case "UNGU":
                setUngu();
                break;
            default:
                System.out.println("Opps.. Belum teridentifikasi");
        }
    }
}
