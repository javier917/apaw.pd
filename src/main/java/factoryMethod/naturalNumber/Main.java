package factoryMethod.naturalNumber;

public class Main {

    public static void main(String[] args) {
        NaturalNumberCreator esCreator=new NaturalNumberEsCreator();
        NumberManager numberManager=new NumberManager();
        numberManager.setCreator(esCreator);
        numberManager.CreateNumber(3);
        System.out.println(numberManager.getNaturalNumber().getTextValue());
        NaturalNumberCreator enCreator=new NaturalNumberEnCreator();
        numberManager.setCreator(enCreator);
        numberManager.CreateNumber(3);
        System.out.println(numberManager.getNaturalNumber().getTextValue());
    }

}
