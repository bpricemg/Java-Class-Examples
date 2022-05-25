class CircleTest {
    public static void main(String[] args) {
        // Create a new cirlce object
        Circle circle1 = new Circle(); 

        // Display info of the first circle
        System.out.println("The area of circle1 is: " + circle1.getArea());
        System.out.println("The radius of circle1 is: " + circle1.getRadius());
        System.out.println();

        // Create another circle object
        Circle circle2 = new Circle(10);

        // Display info of the second circle
        System.out.println("The area of circle2 is: " + circle2.getArea());
        System.out.println("The radius of circle2 is: " + circle2.getRadius());
        System.out.println();

        // Create another circle object
        Circle circle3 = new Circle(60);

        // Display info of the third circle
        System.out.println("The area of circle3 is: " + circle3.getArea());
        System.out.println("The radius of circle3 is: " + circle3.getRadius());
        System.out.println();

        // Update the radius on circle3 to 50
        circle3.updateRadius(50);

        // Again, display infor of the third circle
        System.out.println("The area of circle3 is: " + circle3.getArea());
        System.out.println("The radius of circle3 is: " + circle3.getRadius());
        System.out.println();

        

    }
}