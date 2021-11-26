package corteII;
import java.util.Scanner;

public class Personal {
  public static void main(String[] args) {
      
  //Lectura de teclado
  Scanner teclado = new Scanner(System.in);
  
  //Declaracion de Variables
  String nombre, apellido, departamento, profesion;
  int nacimiento, ingreso;
  double salario;
  char sexo;
  
  //Recolecion de Datos
  System.out.println("Ingresa por favor el nombre: ");
  nombre = teclado.nextLine();
  
  System.out.print("Ingresa apellido: ");
  apellido = teclado.nextLine();
  
  System.out.println("Ingresa el año de nacimiento: ");
  nacimiento = teclado.nextInt();
  
  System.out.println("Ingrese el genero: ");
  sexo = teclado.next().charAt(0);
  
  System.out.println("Ingrese la profesion: ");
  profesion = teclado.nextLine();
  
  System.out.println("Ingrese el departamento donde actualmente labora: ");
  departamento = teclado.nextLine();
  
  System.out.println("Ingrese el salario actual (mensual): ");
  salario = teclado.nextDouble();
  
  System.out.println("Ingrese el año en el que ingreso el empleado: ");
  ingreso = teclado.nextInt();
  
  int edad = 2021 - nacimiento;
  int anios = 2021 - ingreso;
  
  System.out.println("Nombre y Apellido: " + nombre + " " + apellido);
  System.out.println("Edad: " + edad);
  System.out.println("Genero: " + sexo);
  System.out.println("Edad: " + edad);
  System.out.println("Profesion: " + profesion);
  System.out.println("Departamento de Trabajo: " + departamento);
  System.out.println("Salario mensual: " + salario);
  System.out.println("Salario Anual: " + salario*12);
  System.out.println("Años en la empresa: " + anios);
  }
} 