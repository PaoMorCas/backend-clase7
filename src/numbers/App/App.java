package numbers.App;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class App {
    private static final Logger logger = Logger.getLogger(App.class);
    private List<Integer> listaEnteros;

    public App(){
        listaEnteros = new ArrayList<>();
    }

    public void agregarNumeros(Integer numero){
        listaEnteros.add(numero);
        if(listaEnteros.size() > 10){
            logger.info("La lista es mayor a 10, tiene: " + listaEnteros.size());
        }else if(listaEnteros.size() > 5){
            logger.info("La lista es mayor a 5, tiene: " + listaEnteros.size());
        }


    }
    public double obtenerPromedio(){
        if(listaEnteros.size() == 0){
            logger.error("La lista no tiene elementos: " + listaEnteros.size());
        }
        int sum = listaEnteros.stream().mapToInt(Integer::valueOf).sum();
        double promedio = sum / listaEnteros.size();
        logger.info("El promedio es: " + sum +" " + promedio);
        return promedio;
        /*for(int i = 0; i < listaEnteros.size(); i++){
            sum += listaEnteros.get(i);
        }*/
    }

    public Integer obtenerMaximo(){
        logger.info("Calculando maximo");
        return Collections.max(listaEnteros);
    }

    public Integer obtenerMinimo(){
        logger.info("Calculando minimo");
        return Collections.min(listaEnteros);
    }

}
