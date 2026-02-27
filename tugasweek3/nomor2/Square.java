public class Square extends Rectangle {
    //constructors
    public Square(){ //no-arg
        super(1.0, 1.0); //memanggil superclass
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){ //constructor lengkap
        super(side, side, color, filled);
    }

    //Getter
    public double getSide(){
        return getWidth();
    }

    //Setter
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    //override biar tetap jadi square
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    //override toString
    @Override 
    public String toString() {
        return "A Square with side=" + getSide() +
               ", which is a subclass of " + super.toString();
    }

}
