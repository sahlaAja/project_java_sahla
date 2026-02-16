import java.util.*;

public class checkDataTypes_Sahla{
    public static void main(String[] args){
        //kamus data
        System.out.println("Berapa angka yang akan di check ? ");
        Scanner input = new Scanner(System.in);
        int jumlahInput = input.nextInt();

        //proses
        for(int i=0; i < jumlahInput; i++){
            try {
                System.out.println("Masukkan angka ke-" + (i+1) + ": ");
                long angka = input.nextLong();

                System.out.println(angka + " " + "Can be fitted in : ");

                if(angka >= -128 && angka <= 127){
                    System.out.println("* byte");
                }
                if(angka >= -32768 && angka <= 32767){
                    System.out.println("* short");
                } 
                if(angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                
                //output long
                System.out.println("* long");
            } catch(Exception e){
                System.out.println(input.next() + " " + "Can't be fitted anywhere");
            }
        }
        input.close();
    }
}