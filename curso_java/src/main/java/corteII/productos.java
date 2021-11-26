package corteII;
import java.util.Scanner;

public class productos {

    public static void main(String[] args) {
        //Objetos
        Scanner obtenerProducto = new Scanner(System.in);
        
        //variables
        double precio1, precio2, precio3;
        int cantidad1, cantidad2, cantidad3;
        
        //Toman los datos
        System.out.println("Ingresa la cantidad del producto 1: ");
        cantidad1 = obtenerProducto.nextInt();
        System.out.println("Ingrese el precio unitario del producto 1: ");
        precio1 = obtenerProducto.nextDouble();
        System.out.println("Ingresa la cantidad del producto 2: ");
        cantidad2 = obtenerProducto.nextInt();
        System.out.println("Ingrese el precio unitario del producto 2: ");
        precio2 = obtenerProducto.nextDouble();
        System.out.println("Ingresa la cantidad del producto 3: ");
        cantidad3 = obtenerProducto.nextInt();
        System.out.println("Ingrese el precio unitario del producto 3: ");
        precio3 = obtenerProducto.nextDouble();
        
        int cantidad_total = cantidad1 + cantidad2 + cantidad3;
        double subtotal = (precio1 * cantidad1) + (precio2 * cantidad2) + (precio3 * cantidad3);
        double descuento = (subtotal * 10) / 100;
        double total = subtotal - descuento;
        
        System.out.println("Total de productos: " + cantidad_total);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
    }
}

