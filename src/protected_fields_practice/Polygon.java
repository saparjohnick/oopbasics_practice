package protected_fields_practice;

import java.awt.*;

public class Polygon extends ClosedFigure{
    public void insertVertex(Point p, int i) {
        // code to insert vertex at position i
        area = computeArea();
    }

    private double computeArea() {
        // code to compute area
        return 0;
    }
}
