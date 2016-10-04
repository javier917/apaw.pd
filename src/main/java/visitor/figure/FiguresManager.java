package visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
       VisitorArea vA=new VisitorArea();
        for (Figure figure : figures) {
           figure.accept(vA);
        }
        return vA.getArea();
    }

    public double totalNumberOfSides() {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.numberOfSides();
        }
        return result;
    }

}
