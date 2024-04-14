package inheritance;

public class HeavyBox extends Box{
    int weight;

    public HeavyBox(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public HeavyBox() {
    }
}
