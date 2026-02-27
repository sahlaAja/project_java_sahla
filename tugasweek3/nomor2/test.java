public class test {
    public static void main(String[] args) {
        //test shape
        Shape s1 = new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("red", false);
        System.out.println(s2);

        //test circle
        Circle c1 = new Circle(2.5, "blue", true);
        System.out.println(c1);
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());

        //test rectangle
        Rectangle r1 = new Rectangle(2, 4, "yellow", false);
        System.out.println(r1);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        //test Square
        Square sq1 = new Square(3, "black", true);
        System.out.println(sq1);
        System.out.println("Area = " + sq1.getArea());
        System.out.println("Perimeter = " + sq1.getPerimeter());

        // percobaan konsistensi square
        sq1.setWidth(5);
        System.out.println("After setWidth(5): side = " + sq1.getSide());
    }
}
