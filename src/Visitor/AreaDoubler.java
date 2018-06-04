
package Visitor;

import Figures.Circle;
import Figures.Drawing;
import Figures.DrawingBuilder;
import Figures.Figure;
import Figures.FigureVisitor;
import Figures.Rectangle;

public class AreaDoubler implements FigureVisitor {
    
    private final double ratio = Math.sqrt(2.0);
    private Figure result;
    
    @Override
    public void visit(Circle c) {
        result = new Circle(c.getX(), c.getY(), c.getRadius() * ratio);
    }

    @Override
    public void visit(Rectangle r) {
        result = new Rectangle(r.getX(), r.getY(), r.getWidth() * ratio,
                r.getHeight() * ratio);
    }
    
    @Override
    public void visit(Drawing d) {
        DrawingBuilder builder = new DrawingBuilder(d.getX(), d.getY());
        for (Figure fig : d.getComponents()) {
            fig.accept(this);
            builder.addComponent(getFigure());
        }
        result = builder.build();
    }
    
    public Figure getFigure() {
        return result;
    }
}
