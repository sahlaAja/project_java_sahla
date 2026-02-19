package tugasweek2;

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {

    Restaurant menu = new Restaurant();
    menu.tambahMenuMakanan("Pizza", 250000, 20);
    
    menu.tambahMenuMakanan("Spaghetti", 80000, 20);
    menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
    menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
    menu.tampilMenuMakanan();

    //pemesanan menu
    Scanner input = new Scanner(System.in);
    char validasi;
    do {
        System.out.println("==========PEMESANAN MENU==========");
        System.out.println("Pilih Menu : ");
        String pilihMenu = input.nextLine();
        System.out.println("Masukkan Jumlah beli : ");
        int jumlah = input.nextInt();

        menu.pemesananMenu(pilihMenu, jumlah);
        System.out.println("==================================");
        menu.tampilMenuMakanan();
        System.out.println("Apakah anda akan memesan lagi? (y/t) :  ");
        validasi = input.next().charAt(0);
        input.nextLine();
    } while (validasi == 'y');
    
    }
    }