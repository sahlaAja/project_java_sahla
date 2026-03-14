package tugasweek5;

public class GenericsMethods {
    //java generic method, memiliki parameter tipe T
    //digunakan untuk membandingkan dua object GenericsType, dan mengembalikan true jika nilainya sama
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
        return g1.get().equals(g2.get()); //mengambil nilai g1 dan g2 menggunakan get() lalu membandingkan menggunakan equals()
    }

    public static void main(String[] args) {
        GenericsType<String> g1 = new GenericsType<>(); //membuat object dengan tipe data String
        g1.set("Java");

        GenericsType<String> g2 = new GenericsType<>(); //membuat object dengan tipe data String
        g2.set("PHP");

        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2); //memanggil generic method dengan menentukan tipe secara eksplisit
        //above statement can be written simply as
        isEqual = GenericsMethods.isEqual(g1, g2);

        //output
        System.out.println(isEqual);

        /*
        *	This feature, known as type inference, allows you to invoke
        *	a generic method as an ordinary method, without specifying
        *	a type between angle brackets
        */
        // Compiler will infer the type that is needed

    }
}
