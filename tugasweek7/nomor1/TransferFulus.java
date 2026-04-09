package tugasweek7.nomor1;

class Account{ //pembuatan object Account
    int balance = 150; //saldo awal
}
public class TransferFulus {
    public static void main(String[] args) throws InterruptedException{
        Account acc1 = new Account(); //pembuatan object acc1
        Account acc2 = new Account(); //pembuatan object acc2

        //Thread 1 : untuk menjumlahkan / transfer fulus dari acc1 ke acc2
        Thread t1 = new Thread(() -> {
            synchronized (acc1) { 
            //digunakan untuk mencegah race condition, 
            //jadi saat ini diakses thread lain harus antre sampai thread ini selesai di eksekusi
                System.out.println("Thread sedang melakukan transfer fulus dari acc1 ke acc2.");
                try{
                    Thread.sleep(100); //pemberian jeda saat thread 1 dijalankan
                } catch (Exception e){} //agar saat ada error program tidak berhenti mendadak / crash
            synchronized (acc2){
                    //digunakan untuk mencegah race condition, 
                    //jadi saat ini diakses thread lain harus antre sampai thread ini selesai di eksekusi
                        System.out.println("acc2 mendapatkan transfer fulus dari acc1.");
                        acc2.balance += acc1.balance; //penjumlahan saldo acc2 dengan acc1
            }
            }
        });

        //Thread 2 : untuk menjumlahkan / transfer fulus dari acc2 ke acc1
        Thread t2 = new Thread(()->{
            synchronized (acc1){
            //digunakan untuk mencegah race condition, 
            //jadi saat ini diakses thread lain harus antre sampai thread ini selesai di eksekusi
                System.out.println("Thread sedang melakukan transfer fulus dari acc2 ke acc1.");
                try{
                    Thread.sleep(100); //pemberian jeda saat thread 2 dijalankan
                } catch (Exception e){} //agar saat ada error program tidak berhenti mendadak / crash
            synchronized (acc2){
                    //digunakan untuk mencegah race condition, 
                    //jadi saat ini diakses thread lain harus antre sampai thread ini selesai di eksekusi
                        System.out.println("acc1 mendapatkan transfer fulus dari acc2.");
                        acc1.balance += acc2.balance; //penjumlahan saldo acc1 dengan acc2
            }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo akhir acc1 : " + acc1.balance);
        System.out.println("Saldo akhir acc2 : " + acc2.balance);
    }
}
