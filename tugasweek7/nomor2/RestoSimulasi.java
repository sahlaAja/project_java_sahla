package tugasweek7.nomor2;

import java.util.concurrent.locks.ReentrantLock;

class Resto {
    private int chickenStock = 100; //stock chicken yang dimiliki resto
    private final ReentrantLock lock = new ReentrantLock(); //pembuatan variabel lock

    public void serveCustomer(String cashierName) { //pembuatan method untuk menampilkan logika output 
        lock.lock(); //kunci data

        try{
            if (chickenStock > 0) {
                try { 
                    Thread.sleep(10); //jeda eksekusi thread
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } //untuk handle error
    
                chickenStock--; //untuk mengurangi stok
                System.out.println(cashierName + " berhasil menjual 1 ayam. Sisa stok: " + chickenStock);
            } else {
                System.out.println(cashierName + " gagal: Stok Habis!");
            }
        } finally {
        lock.unlock(); //lepas kunci agar tidak deadlock saat error
    } 
}

    public int getRemainingStock() { //method untuk mengembalikan stok
        return chickenStock;
    }
}
    

public class RestoSimulasi {
    public static void main(String[] args) throws InterruptedException { 
        Resto ayamJuicyLuicyGallagher = new Resto(); //pembuatan object bernama ayamJuicyLuicyGallagher

        Runnable task = () -> {
        for (int i = 0; i < 40; i++) { //jalankan thread sebanyak 40 kali
            ayamJuicyLuicyGallagher.serveCustomer(Thread.currentThread().getName()); //untuk menjalankan method serveCustomer
        }
        };

        Thread kasir1 = new Thread(task, "Kasir-A"); //pembuatan thread kasir1 
        Thread kasir2 = new Thread(task, "Kasir-B"); //pembuatan thread kasir2
        Thread kasir3 = new Thread(task, "Kasir-C"); //pembuatan thread kasir3
        
        //mulai thread
        kasir1.start(); 
        kasir2.start(); 
        kasir3.start();

        kasir1.join(); 
        kasir2.join(); 
        kasir3.join();

        System.out.println("--- HASIL AKHIR STOK: " + ayamJuicyLuicyGallagher.getRemainingStock() + " ---");
    }

}
