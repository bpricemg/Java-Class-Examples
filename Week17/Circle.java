class Circle {
    /** Instance variable */
    double radius = 1.0;

    /** Constructor that builds a cirlce with a radius of 1 */
    Circle(){
    }

    /** Constructor that builds a circle with a given radius */
    Circle(double providedRadius) {
        radius = providedRadius;
    }

    /** Instance Method - Get the area of this circle */
    double getArea() {
        return radius * radius * 3.141592653589;
    }

    /** Get the radius of this circle */
    double getRadius() {
        return radius;
    }
}