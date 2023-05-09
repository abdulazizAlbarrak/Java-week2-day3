public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("red",true);
        System.out.println(s2.toString());

        Circle c1 = new Circle();
        System.out.println(c1.toString());
        Circle c2 = new Circle(2);
        System.out.println(c2.toString());
        Circle c3 = new Circle("black",true,5);

        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        Rectangle r2 = new Rectangle(5,6);
        System.out.println(r2.toString());
        Rectangle r3 = new Rectangle("white",true,4,3);
        System.out.println(r3.toString());

        Square q1 = new Square();
        System.out.println(q1.toString());
        Square q2 = new Square(4);
        System.out.println(q2.toString());
        Square q3 = new Square("blue",true,7);
        System.out.println(q3.toString());
    }
}