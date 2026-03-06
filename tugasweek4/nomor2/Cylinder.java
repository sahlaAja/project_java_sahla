package tugasweek4.nomor2;

public class Cylinder extends Shape {
    //kamus data
    private double radius;
    private double height;

    //constructor
    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area(){
        return Math.PI * radius * radius * height;
    }

    public String toString(){
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
