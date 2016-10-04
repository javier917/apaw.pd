package factoryMethod.naturalNumber;

public class NumberManager {
    private NaturalNumber naturalNumber;

    private NaturalNumberCreator creator;

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }
    
    public void CreateNumber(){
        this.naturalNumber=this.creator.createNaturalNumber();
    }
}
