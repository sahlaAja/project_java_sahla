package tugasweek5;

class Bound<T extends A>{ //class generic dengan bounded type, T harus turunan dari class A
    private T objRef;

    //constructor
    public Bound(T obj){
        this.objRef = obj;
    }

    public void doRunTest(){ //untuk menjalankan method displayClass() 
        this.objRef.displayClass();
    }
}

//superclass
class A{
    //method yang akan diwarisi oleh subclass
    public void displayClass(){
        System.out.println("Inside super class A");
    }
}

//subclass B yang mewarisi superclass A
class B extends A{
    //override
    public void displayClass(){
        System.out.println("Inside sub class B");
    }
}

//subclass C yang mewarisi superclass A
class C extends A{
    //override
    public void displayClass(){
        System.out.println("Inside sub class C");
    }
}

public class BoundedClass {
    public static void main(String a[]){
        // Creating object of sub class C and passing it to Bound as a type parameter. 
        Bound<C> bec = new Bound<C>(new C()); 
        bec.doRunTest();
        // Creating object of sub class B and passing it to Bound as a type parameter. 
        Bound<B> beb = new Bound<B>(new B()); 
        beb.doRunTest();
        // similarly passing super class A 
        Bound<A> bea = new Bound<A>(new A()); 
        bea.doRunTest();

    }
}
