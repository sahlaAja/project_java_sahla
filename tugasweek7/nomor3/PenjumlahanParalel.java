package tugasweek7.nomor3;

import java.util.Scanner;

class Penjumlahan extends Thread{
    private int awal, akhir; //batas penjumlahan (bawah & atas)
    private long JumlahParsial; //memori untuk menyimpan data dari suatu thread

    public Penjumlahan(int awal, int akhir){
        this.awal = awal;
        this.akhir = akhir;
    }

    @Override
    public void run(){
        JumlahParsial = 0; //hasil awal
        //output
        System.out.println(Thread.currentThread().getName() + " mengerjakan : " + awal + " - " + akhir);

        for (int i = awal; i <= akhir; i++) {
            JumlahParsial += i; //stok penjumlahan nantiii
        }

        System.out.println(" hasil parsial " + Thread.currentThread().getName() + " : " + JumlahParsial); 
    }

    public long getJumlahParsial(){
        return JumlahParsial; //modul untuk mengembalikan nilai JumlahParsial
    }
}

public class PenjumlahanParalel {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in); //pembuatan model input

        try {
            System.out.print("Masukkan Jumlah Thread : ");
            int JumlahThread = input.nextInt();
            System.out.print("Masukkan Angka Akhir : ");
            int AngkaAkhir = input.nextInt();
            
            //untuk menentukan apakah input benar atau tidak
            if (JumlahThread <= 0 || AngkaAkhir <= 0) {
                System.out.println("Input yang dimasukan harus lebih besar dari 0!");
                return; //untuk menghentikan program jika tidak valid
            }

            Penjumlahan[] threads = new Penjumlahan[JumlahThread]; //pembuatan object
            
            //Divide and Conquer, beban kerja ke Thread berukuran
            int range = AngkaAkhir / JumlahThread; //beban kerja 
            int awal = 1; //mulai dari elemen 1

                //bagi tugas ke thread
                for (int i = 0; i < JumlahThread; i++) {
                    int akhir = (i == JumlahThread - 1) ? AngkaAkhir : awal + range - 1;

                    threads[i] = new Penjumlahan(awal, akhir);
                    threads[i].setName("Thread-" + (i+1));
                    threads[i].start(); //mulai eksekusi thread

                    awal = akhir + 1;
                }
                long total = 0;

                //eksekusi setelah semua thread menyelesaikan tugasnya
                for (int i = 0; i < JumlahThread; i++) {
                    threads[i].join(); //agar Thread menunggu eksekusi thread lain
                    total += threads[i].getJumlahParsial();  //penjumlahan akhir dari semua thread
                }

                System.out.println("\nHasil akhir : " + total);
                    
        } catch (Exception e) {
            System.out.println("Ada kesalahan input, coba lagi!");
        }
    }
}
