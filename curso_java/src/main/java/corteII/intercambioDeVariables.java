package corteII;
import java.util.Scanner;

public class intercambioDeVariables {  
    public static void main(String[] args) {
        //Objetos y variables
        int var1, var2;
        Scanner leer = new Scanner(System.in);
        
        //toma de datos
        System.out.println("Ingrese el valor de la variable 1: ");
        var1 = leer.nextInt();
        System.out.println("Ingrese el valor de la variable 2: ");
        var2 = leer.nextInt();
        
        //Intercambio
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        
        //Resultados
       System.out.println("Los valores intercambiados ahora son variable 1: " + var1 + " y variable 2: " + var2);
    }
    
}
