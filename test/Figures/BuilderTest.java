
package Figures;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BuilderTest {
    
    private DrawingBuilder builder;
    
    @Before
    public void initialisations() {
        builder = new DrawingBuilder(10, 50);
    }
    @Test
    public void initialising_and_building_returns_empty_drawing_in_given_coords() {
        Drawing d = builder.build();
        assertEquals(10, d.getX(), 0);
        assertEquals(50, d.getY(), 0);
        assertEquals(new ArrayList<>(), d.getComponents());
    }
    
    @Test
    public void one_figure_in_builder_makes_one_figure_in_drawing() {
        Figure comp = new Circle(1, 2, 3);
        List<Figure> lst = new ArrayList<>();
        lst.add(comp);
        
        builder.addComponent(comp);
        assertEquals(new Drawing(10, 50, lst), builder.build());
    }
    
    @Test
    public void two_figures_in_builder_makes_two_figures_in_drawing() {
        Figure comp1 = new Circle(1, 2, 3);
        Figure comp2 = new Rectangle(50, 25, 25, 30);
        List<Figure> lst = new ArrayList<>();
        lst.add(comp1);
        lst.add(comp2);
        
        builder.addComponent(comp1).addComponent(comp2);
        assertEquals(new Drawing(10, 50, lst), builder.build());
    }
}
