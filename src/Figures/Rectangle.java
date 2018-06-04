
package Figures;

public class Rectangle extends Figure {
    
    private final double width;
    private final double height;
    
    public Rectangle(double x, double y, double w, double h) {
        super(x, y);
        width = w;
        height = h;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
}
