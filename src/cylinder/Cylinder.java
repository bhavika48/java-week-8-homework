package cylinder;

class Cylinder extends Circle {
    double height;

    // Creating constructor with params
    Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    // creating getter method for height
    public double getHeight() {
        return height;
    }
    // creating calculation method
   public double getVolume(){
        double volume = 0;
        //calculation
       volume = getArea() * height;
        return volume;

   }



}
