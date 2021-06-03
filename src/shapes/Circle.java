package shapes;

public class Circle {
    private boolean created;
    private double radius;
    private double area;
    private double circumference;
    
    public void setCreated(boolean c) {
        this.created = c;
    }
    
    public boolean getCreated() {
        return this.created;
    }
    
    public void setRadius(double r) {
        this.radius = r;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
}
