package shapes;

public class Cone {
    private boolean created;
    private double radius;
    private double height;
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
    
    public void setHeight(double h) {
        this.height = h;
    }
    
    public double getHeight() {
        return this.height;
    }
}
