package magic;

public class Point implements Cloneable{
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Точка с координатами (" + x + ", " + y + ")";
    }

    public Point clone(){
        return new Point(x,y);
    }
}
