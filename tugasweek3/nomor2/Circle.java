public class Circle extends Shape {
    //deklarasi variabel
    private double radius;

    //constructors
    public Circle(){ //no-arg
        //panggil superclass & inisiasi nilai variabel
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){ //constructor radius
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){ //constructor lengkap
        super(color, filled);
        this.radius = radius;
    }

    //Getter
    public double getRadius(){
        return radius;
    }

    //Setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    //method hitung
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    //override toString
    @Override
    public String toString(){
        return "A Circle with radius=" + radius +
               ", which is a subclass of " + super.toString();
    }
}
