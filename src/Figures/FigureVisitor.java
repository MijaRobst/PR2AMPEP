
package Figures;

public interface FigureVisitor {
    public void visit(Circle c);
    public void visit(Drawing d);
    public void visit(Rectangle r);
}
