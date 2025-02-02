package interfaces;

public abstract class Shape implements DrawShape{
    public int x;
    public int y;
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract public void draw();
}
