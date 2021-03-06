
package Figures;

public abstract class Figure {
    private final double x;
    private final double y;
    
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public abstract void accept(FigureVisitor fv);
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Figure)) {
            return false;
        }
        Figure f = (Figure) o;
        return x == f.getX() && y == f.getY();
    }
}
