public class Rectangle extends Shape {
    //deklarasi variabel
    private double width;
    private double length;

    //constructors
    public Rectangle(){ //no-arg
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){ //constructor width & length
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){ //constructor lengkap
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    //Getter
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }

    //Setter
    public void setWidth(double width){
        this.width = width;
    } 
    public void setLength(double length){
        this.length = length;
    }

    //method hitung
    public double getArea(){
        return width * length; //cari luas persegi panjang
    }
    public double getPerimeter(){
        return 2 * (width + length); //cari keliling persegi panjang
    }

    //override toString
    @Override
    public String toString(){
        return "A Rectangle with width=" + width +
               " and length=" + length +
               ", which is a subclass of " + super.toString();
    }
}
