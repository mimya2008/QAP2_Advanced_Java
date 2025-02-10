public class MyPoint{
    private int x;
    private int y;
    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public MyPoint(MyPoint p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return("("+this.x+","+this.y+")") ;
    }
    public double distance(int x, int y)
    {
        int xDiff = this.x-x;
        int yDiff = this.y-y;
        return Math.sqrt((xDiff*xDiff) + (yDiff*yDiff));
    }
    public double distance(MyPoint p)
    {
        int xDiff = this.x-p.x;
        int yDiff = this.y-p.y;
        return Math.sqrt((xDiff*xDiff) + (yDiff*yDiff));

    }
    public double distance()
    {
        int xDiff = this.x-0;
        int yDiff = this.y-0;
        return Math.sqrt((xDiff*xDiff) + (yDiff*yDiff));
    }
}