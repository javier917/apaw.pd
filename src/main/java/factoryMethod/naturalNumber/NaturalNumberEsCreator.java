package factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator{

    @Override
    public NaturalNumber createNaturalNumber(int number) {
        return new NaturalNumberEs(number);
    }

}
