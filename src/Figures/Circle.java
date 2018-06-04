
package Figures;

public class Circle extends Figure {
    
    private final double r;
    
    public Circle(double x, double y, double radius) {
        super(x, y);
        r = radius;
    }
    
    public double getRadius() {
        return r;
    }
    
    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle c = (Circle) o;
        return super.equals(o) && r == c.getRadius();
    }
}
