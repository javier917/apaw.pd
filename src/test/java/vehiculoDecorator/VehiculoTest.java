package vehiculoDecorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VehiculoTest {
private Vehiculo vehiculo;
    @Before
    public void init(){
        Coche coche=new Coche();
        GPSDecorador gpsDecorador=new GPSDecorador(coche);
        this.vehiculo=gpsDecorador;
    }
    
    @Test
    public void precioFinalTest(){
      assertEquals(10500,this.vehiculo.precioFinal());  
    }
    
    @Test
    public void descripcionFinalTest(){
        MP3Decorador mp3=new MP3Decorador(vehiculo);
        this.vehiculo=mp3;
        assertTrue(mp3.descripcionFinal().equals("Soy un coche con GPS con MP3"));
    }
    
}
