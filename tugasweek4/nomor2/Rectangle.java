package tugasweek4.nomor2;

public class Rectangle extends Shape {
    //kamus data
    private double length;
    private double width;

    //constructor
    public Rectangle(double l, double w){
        super("Rectangle");
        length = l;
        width = w;
    }

    public double area(){
        return length * width;
    }

    public String toString(){
        return super.toString() + " of length " + length + " and width " + width;
    }
}
