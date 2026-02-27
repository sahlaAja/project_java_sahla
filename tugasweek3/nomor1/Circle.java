//buat model circle dengan radius dan warna
public class Circle {
    //kamus data
    private double radius;
    private String color;

    //constructors
    public Circle(){
        radius = 1.0;
        color = "blue";
    }

    public Circle(double r){
        radius = r;
        color = "blue";
    }

    //penambahan constructor circle (radius, color)
    public Circle(double r, String color){
        radius = r;
        this.color = color;
    }

    //getter radius
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public String toString(){
        return "Circle[radius = " + radius + "color= " + color + "]";
    }

    //getter & setter color
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
}
