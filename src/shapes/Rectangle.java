package shapes;

public class Rectangle {
    private boolean created;
    private double length;
    private double width;
    private double area;
    private double perimeter;
    
    public void setCreated(boolean c) {
        this.created = c;
    }
    
    public boolean getCreated() {
        return this.created;
    }
    
    public void setLength(double l) {
        this.length = l;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public void setWidth(double w) {
        this.width = w;
    }
    
    public double getWidth() {
        return this.width;
    }
    
}
