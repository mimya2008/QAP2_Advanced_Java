// Problem#2
//The MyRectangle and MyPoint Classes

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructor with coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // constructor with MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }


    // getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }


    // Methods
    // width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // height of the rectangle
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }


    // toString Method

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
