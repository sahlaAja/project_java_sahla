package tugasweek5;


interface MinMax<T extends Comparable<T>> { //interface generics dengan batasan
    T max(); //method mencari nilai terbesar
}

class MyClass<T extends Comparable<T>> implements MinMax<T> { //class menggunakan generics T

    T[] vals; //array yang menyimpan data dengan tipe data T
 
    // Constructor untuk mengisi array vals saat object nanti dibuat
    MyClass(T[] o) {
        vals = o;
    }

    // mencari nilai terbesar
    public T max() {
        T v = vals[0]; //elemen pertama ditetapkan sebagai nilai terbesar sementara

        for (int i = 1; i < vals.length; i++) {
            // menggunakan compareTo dari Comparable
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }

        return v;
    }
}

public class Main {

    public static void main(String[] args) {

        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> a = new MyClass<>(inums); //pembuatan object MyClass dengan tipe Integer
        MyClass<Character> b = new MyClass<>(chs); //pembuatan object MyClass dengan tipe Character

        System.out.println("Nilai Integer Terbesar: " + a.max());
        System.out.println("Karakter Terbesar: " + b.max());
    }

}