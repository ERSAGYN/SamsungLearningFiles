package inheritance;

public class ColorBox extends Box{
    String color;

    public ColorBox(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }

    public ColorBox(String color) {
        this.color = color;
    }
}
