package visitorEj2;

public class Visitor2 extends Visitor {
    private int as;

    private int bs;

    public Visitor2() {
        this.as = 0;
        this.bs = 0;
    }

    @Override
    public void visitElementA(ElementA e) {
        this.as++;

    }

    @Override
    public void visitElementB(ElementB e) {
        this.bs++;

    }

    public int getAs() {
        return as;
    }

    public int getBs() {
        return bs;
    }

}
