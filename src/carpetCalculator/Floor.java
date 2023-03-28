package carpetCalculator;

public class Floor {
    double width;
    double length;

    // creating constructor with if else condition
    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // creating method without params
    public double getArea() {
        double area = 0;
        //calculation
        area = this.width * this.length;
        return area;
    }

}
