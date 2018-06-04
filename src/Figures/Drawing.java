
package Figures;

import java.util.List;
import static java.util.Collections.unmodifiableList;

public class Drawing extends Figure {
    
    private final List<Figure> components;
    
    public Drawing(double x, double y, List<Figure> lst) {
        super(x, y);
        components = lst;
    }
    
    public List<Figure> getComponents() {
        return unmodifiableList(components);
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Drawing)) {
            return false;
        }
        Drawing d = (Drawing) o;
        return super.equals(o) && components.equals(d.getComponents());
    }
    
}
