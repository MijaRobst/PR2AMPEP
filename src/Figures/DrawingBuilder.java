package Figures;

import java.util.ArrayList;
import java.util.List;


public class DrawingBuilder {
    private final double x;
    private final double y;
    private final List<Figure> components = new ArrayList<>();
    
    /**
     * Initializes a Builder of Drawings.
     * @param x The horizontal coordinate of the drawing.
     * @param y The vertical coordinate of the drawing.
     */
    public DrawingBuilder(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Adds a Figure to the Drawing.
     * @param c The Figure to add.
     * @return The Builder (to allow fluid calls).
     */
    public DrawingBuilder addComponent(Figure c) { 
        components.add(c);
        return this; // Fluid calls not required in report, but nice to have
    }
    
    /**
     * Builds the Drawing.
     * @return The Drawing object created with the Builder.
     */
    public Drawing build() {
        return new Drawing(x, y, components);
    }
}
