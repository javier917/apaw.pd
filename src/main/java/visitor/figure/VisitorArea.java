package visitor.figure;

public class VisitorArea extends Visitor{
    private double area;
    public VisitorArea() {
        area=0;
    }
    @Override
    public void visitCircle(Circle circle) {
        area=area+circle.area();
    }

    @Override
    public void visitSquare(Square square) {
        area=area+square.area();
        
    }

    @Override
    public void visitTriangle(Triangle triangle) {
       area=area+triangle.area();
        
    }

}
