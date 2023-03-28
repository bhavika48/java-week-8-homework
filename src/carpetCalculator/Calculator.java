package carpetCalculator;

public class Calculator {
    //String firstName;
    Floor floor;
    Carpet carpet;

    // creating constructor
    public Calculator(Floor f, Carpet c) {
        this.floor = f;
        this.carpet = c;
    }

    // creating method without params
    public double getTotalCost() {
        double totalCost = 0.0;
        // calculation
        // floor.getArea()
        totalCost = this.floor.getArea() * this.carpet.getCost();
        return totalCost;
    }

}
