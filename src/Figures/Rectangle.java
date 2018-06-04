
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
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle r = (Rectangle) o;
        return super.equals(o) && width == r.getWidth() && height == r.getHeight();
    }
}
