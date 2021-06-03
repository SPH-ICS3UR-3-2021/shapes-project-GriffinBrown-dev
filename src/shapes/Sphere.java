package shapes;

public class Sphere {
    private boolean created;
    private double radius;
    private double volume;
    private double surfacearea;
    
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
