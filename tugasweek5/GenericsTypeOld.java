package tugasweek5;

public class GenericsTypeOld {
    private Object t; //pakai tipe object karena kita belum tahu tipe data t

    public Object get(){
        return t;
    }

    public void set(Object t){
        this.t = t;
    }

    //main
    public static void main(String[] args) {
        GenericsTypeOld type = new GenericsTypeOld(); //membuat object bernama type dari class GenericTypeOld
        type.set("Java");
        String str = (String) type.get();  // type casting, error prone and can cause ClassCastException
        System.out.println(str); //untuk menampilkan output
    }
}
