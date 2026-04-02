package tugasweek6.nomor3;

//import library
import java.util.Arrays;
import java.util.stream.Collectors;

public class ProblemThree {
    public static void main(String[] args) {
        int arr[] = {12,4,3,1,9,657};
        int n = 3; //mencari elemen terbesar ke-3

        int ans = Arrays.stream(arr) //buka stream
        .boxed() //ubah ke Stream<Integer>
        .sorted((a, b) -> Integer.compare(b, a)) //sorting descending
        .skip(n-1) //lewati 2 elemen awal
        .findFirst() //ambil data yang tersisa
        .orElse(0); // Nilai default jika tidak ada

        System.out.println("Elemen terbesar ke-3 adalah: " + ans);
    }
    
}