public class TesMyLine {
    public static void main(String[] args) {
        // MyPoint instances
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // MyLine instances using constructors
        MyLine line1 = new MyLine(p1, p2);
        MyLine line2 = new MyLine(2, 3, 5, 7);

        // getters
        System.out.println("Begin Point of line1: " + line1.getBegin());
        System.out.println("End Point of line1: " + line1.getEnd());
        System.out.println("Begin X of line2: " + line2.getBeginX());
        System.out.println("Begin Y of line2: " + line2.getBeginY());
        System.out.println("End X of line2: " + line2.getEndX());
        System.out.println("End Y of line2: " + line2.getEndY());

        // setters
        line1.setBegin(new MyPoint(0, 0));
        line1.setEnd(new MyPoint(3, 4));
        System.out.println("Updated line1: " + line1);

        line2.setBeginXY(1, 1);
        line2.setEndXY(4, 5);
        System.out.println("Updated line2: " + line2);

        // methods
        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Gradient of line1: " + line1.getGradient());
        
    }
}
