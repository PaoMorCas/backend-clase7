package numbers.App;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumbers {
    @Test
    public  void main() {
        //DADO
        App lista = new App();
        int i = 1;
        //CUANDO
        while(i < 11){
            lista.agregarNumeros(i);
            i++;
        }
        //ENTONCES
        double promedio = lista.obtenerPromedio();
        Assertions.assertNotEquals(0,promedio);
        if(promedio>0){
            Integer max = lista.obtenerMaximo();
            Assertions.assertEquals(10, max);
            Integer min =lista.obtenerMinimo();
            Assertions.assertEquals(1, min);

        }
    }
}
