package corteII;
import java.util.Scanner;

public class MillasNaucticas {
    
    public static void main(String[] args) {
        //variable
        double distanciaMillasMarinas;
        
        //objetos
        Scanner tomarDatos = new Scanner(System.in);
        
        //toma de datos
        System.out.println("Ingresa las millas nauticas: ");
        distanciaMillasMarinas = tomarDatos.nextDouble();
        
        //Cambio
        double distanciaMetros = distanciaMillasMarinas * 1852;
        
        System.out.println(distanciaMillasMarinas + " millas nauticas equivalen a " + distanciaMetros + " metros.");
    }
    
}
