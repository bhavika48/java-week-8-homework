package poolArea;

public class Cuboid extends Rectangle {
    double height;

    // creating constructor with params
    Cuboid(double width, double length, double height) {
        super(width, length);

        if (height < 0) {
            this.length = 0;
        } else {
            this.height = height;
        }
    }

    // creating method
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double volume = 0;
        volume = getArea() * height;
        return volume;
    }

}
