package shapes;

public class Prism {
    private boolean created;
    private double length;
    private double width;
    private double height;
    private double volume;
    private double surfacearea;
    
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
    
    public void setHeight(double h) {
        this.height = h;
    }
    
    public double getHeight() {
        return this.height;
    }
}
