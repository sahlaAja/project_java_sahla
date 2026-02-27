//menggunakan superclass circle
public class Cylinder extends Circle {
    //kamus data
    private double height;

    //constructor
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    //A public method for retrieving the height
    public double getHeight(){
        return height;
    }

    //override getArea() -> luas permukaan tabung
    @Override
    public double getArea(){
        double baseArea = super.getArea(); //luas lingkaran
        double radius = getRadius();
        return (2 * Math.PI * radius * height) + (2 * baseArea);
    }
    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area 
    public double getVolume() {
    return super.getArea() * height; //alas X tinggi
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
}
