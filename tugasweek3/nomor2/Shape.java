public class Shape {
    //deklarasi variabel
    private String color;
    private boolean filled;

    //constructor 
    public Shape(){ //no-arg
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled){ //parameter
        this.color = color;
        this.filled = filled;
    }

    //Getter
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }

    //Setter
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //toString()
    public String toString(){
        return "A Shape with color of " + color + " and " + (filled? "filled" : "Not filled");
    }
}
