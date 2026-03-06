package tugasweek4.nomor2;

public abstract class Shape {
    protected String shapeName;

    //constructor
    public Shape(String name){
        shapeName = name;
    }

    //method untuk menghitung area
    public abstract double area();

    public String toString(){
        return shapeName;
    }

}
