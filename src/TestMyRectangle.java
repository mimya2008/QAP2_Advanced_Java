// This test cases for My rectangle

public class TestMyRectangle {
    public static void main(String[] args) {
        // MyPoint instances
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(6, 1);

        // Create MyRectangle instances using different constructors
        MyRectangle r1 = new MyRectangle(p1, p2);
        MyRectangle r2 = new MyRectangle(2, 7, 8, 2);

        // getters
        System.out.println("Top Left of r1: " + r1.getTopLeft());
        System.out.println("Bottom Right of r1: " + r1.getBottomRight());
        System.out.println("Top Left of r2: " + r2.getTopLeft());
        System.out.println("Bottom Right of r2: " + r2.getBottomRight());

        // setters
        r1.setTopLeft(new MyPoint(0, 6));
        r1.setBottomRight(new MyPoint(5, 0));
        System.out.println("Updated r1: " + r1);


        // methods
        System.out.println("Width of r1: " + r1.getWidth());
        System.out.println("Height of r1: " + r1.getHeight());
        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());

    }
}

