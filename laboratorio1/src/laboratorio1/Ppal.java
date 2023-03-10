package laboratorio1;

/**
 *
 * @author Johan Herrera
 *         Maria Camila Guzman 
 *         Alejandra Alvarado 
 */
public class Ppal {

    public static void main(String[] args) {
        
        Areas ppal = new Areas();
        
        ppal.base = ppal.datos("Ingrese la base");
        ppal.altura = ppal.datos("Ingrese la altura");
        ppal.radio = ppal.datos("Ingrese el radio");
        ppal.areaCuadrado();
        ppal.areaCirculo();
        ppal.resultado("El area del cuadrado es "+ppal.areaCuadrado);
        ppal.resultado("El area del circulo es "+ppal.areaCuadrado);
        
    }
    
}
