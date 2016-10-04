package factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberManagerTest {
    private NumberManager numberManager;
    @Before 
    public void ini(){
        this.numberManager=new NumberManager();
    }
    @Test
    public void testEspañol() {
        NaturalNumberCreator esCreator=new NaturalNumberEsCreator();
        this.numberManager.setCreator(esCreator);
        this.numberManager.CreateNumber(3);
        assertEquals(this.numberManager.getNaturalNumber().getTextValue(),"tres");
    }
    @Test
    public void testIngles(){
        NaturalNumberCreator enCreator=new NaturalNumberEnCreator();
        this.numberManager.setCreator(enCreator);
        this.numberManager.CreateNumber(3);
        assertEquals(this.numberManager.getNaturalNumber().getTextValue(),"three");
    }
}
