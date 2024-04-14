package box;

public class HeavyBox implements Comparable<HeavyBox>{
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox o) {
        return 0;
    }
}
