public class Circle {
    private double radius;
 
    public Circle() {
        radius = 0.0;  
    }
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    } 
}
