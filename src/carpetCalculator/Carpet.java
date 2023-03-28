package carpetCalculator;

public class Carpet {
    double cost;

    // creating constructor with params
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    //creating method
    public double getCost() {
        return cost;
    }
}

