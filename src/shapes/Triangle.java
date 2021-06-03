package shapes;

public class Triangle {
    private boolean created;
    private double length;
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
  
}
