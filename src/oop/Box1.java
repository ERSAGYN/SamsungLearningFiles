package oop;
public class Box1 {
    double width;
    double height;
    double depth;

    Box1 (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    double getVolume() {
        return width * height * depth;
    }

    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
