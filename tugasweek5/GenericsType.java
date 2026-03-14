package tugasweek5;

public class GenericsType<T> { //menggunakan Generic Type Parameter
    private T t; //membuat variabel t bertipe T

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t = t1;
    }

    public static void main(String[] args) {
        GenericsType<String> type = new GenericsType<>(); //membuat object type dengan tipe data string
        type.set("Java"); //valid
        System.out.println(type.get());

        GenericsType type1 = new GenericsType(); //raw type, membuat object type1
        type1.set("Java"); //valid
        type1.set(10); //valid and autoboxing support
        System.out.println(type1.get());
    }
}
