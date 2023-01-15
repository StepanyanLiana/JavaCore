package chapter6;

public class Box {
    double width;
    double height;
    double depth;


    Box() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * depth * height;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box (double w, double h, double d) {
        width = w;
        depth = d;
        height = h;
    }

}
