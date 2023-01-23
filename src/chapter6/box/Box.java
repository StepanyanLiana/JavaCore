package chapter6.box;

public class Box {
    double width;
    double heigth;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    Box() {
        width = -1;
        heigth = -1;
        depth = -1;
    }

    Box(double len) {
        width = heigth = depth = len;
    }

    double volume() {
        return width * heigth * depth;
    }
}
