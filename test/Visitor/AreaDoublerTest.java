
package Visitor;

import Figures.Circle;
import Figures.Drawing;
import Figures.DrawingBuilder;
import Figures.Rectangle;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AreaDoublerTest {
    
    private AreaDoubler v;
    
    @Before
    public void initializations() {
        v = new AreaDoubler();
    }
    
    @Test
    public void double_circle() {
        Circle c = new Circle(50, 50, 10);
        Circle expected = new Circle(50, 50, 10 * Math.sqrt(2));
        c.accept(v);
        Circle result = (Circle) v.getFigure();
        assertEquals(expected, result);
    }
    
    @Test
    public void double_rectangle() {
        Rectangle r = new Rectangle(20, 20, 10, 30);
        Rectangle expected = new Rectangle(20, 20, 10 * Math.sqrt(2), 30 * Math.sqrt(2));
        r.accept(v);
        Rectangle result = (Rectangle) v.getFigure();
        assertEquals(expected, result);
    }
    
    @Test
    public void double_drawing() {
        Drawing d = new DrawingBuilder(10, 20)
                .addComponent(new Circle(10, 20, 100))
                .addComponent(new Rectangle(50, 50, 70, 30))
                .build();
        Drawing expected = new DrawingBuilder(10, 20)
                .addComponent(new Circle(10, 20, 100 * Math.sqrt(2)))
                .addComponent(new Rectangle(50, 50, 70 * Math.sqrt(2), 30 * Math.sqrt(2)))
                .build();
        d.accept(v);
        Drawing result = (Drawing) v.getFigure();
        assertEquals(expected, result);
    }
}
