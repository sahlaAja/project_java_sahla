public class TestCylinder {
    public static void main(String[] args) {
        //deklarasi dan inisiasi variabel c1
        Cylinder c1 = new Cylinder();

        //output
        System.out.println("Cylinder:"
        + " radius=" + c1.getRadius()
        + " height=" + c1.getHeight()
        + " base area=" + c1.getArea()
        + " volume=" + c1.getVolume());

        //deklarasi dan inisiasi variabel c2
        Cylinder c2 = new Cylinder(10.0);

        //output
        System.out.println("Cylinder:"
        + " radius=" + c2.getRadius()
        + " height=" + c2.getHeight()
        + " base area=" + c2.getArea()
        + " volume=" + c2.getVolume());

        //deklarasi dan inisiasi variabel c3
        Cylinder c3 = new Cylinder(2.0, 10.0);

        //output
        System.out.println("Cylinder:"
        + " radius=" + c3.getRadius()
        + " height=" + c3.getHeight()
        + " base area=" + c3.getArea()
        + " volume=" + c3.getVolume());

        System.out.println("\nTesting toString():");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        

    }
}
