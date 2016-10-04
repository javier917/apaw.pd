package visitor.figure;

public class VisitorNumberOfSides extends Visitor {
    private double numberOfSides;

    public VisitorNumberOfSides() {
        this.numberOfSides = 0;
    }

    @Override
    public void visitCircle(Circle circle) {
        numberOfSides = numberOfSides + circle.numberOfSides();

    }

    @Override
    public void visitSquare(Square square) {
        numberOfSides = numberOfSides + square.numberOfSides();

    }

    @Override
    public void visitTriangle(Triangle triangle) {
        numberOfSides = numberOfSides + triangle.numberOfSides();

    }

    public double getNumberOfSides() {
        return numberOfSides;
    }

}
