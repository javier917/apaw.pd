package visitor.figure;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FiguresManagerTest {
    FiguresManager figureManager;

    @Before
    public void init() {
        figureManager=new FiguresManager();
        Square square = new Square("Cuadrado", 2);
        Triangle triangle = new Triangle("triangulo", 2, 1);
        this.figureManager.add(triangle);
        this.figureManager.add(square);
    }

    @Test
    public void totalNumberOfSidesTest() {
        assertEquals(this.figureManager.totalNumberOfSides(), 7, 10e-5);
    }
    
    @Test
    public void totalAreaTest(){
        this.figureManager.add(new Circle("Circulo", 3));
        assertEquals(this.figureManager.totalArea(),33.2743338,10e-5);
    }
    
}
