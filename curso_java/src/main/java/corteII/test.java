package corteII;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
      
  //Lectura de teclado
  Scanner teclado = new Scanner(System.in);
  
  empleado oEmpleado = new empleado();
  
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
  
  int edad = oEmpleado.edadDelTrabajador();
  int anios = oEmpleado.tiempoDeTrabajo();
  
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

class empleado {
      
  //Variables de la calase
  private String nombre, apellido, departamento, profesion;
  private int nacimiento, ingreso;
  private double salario;
  private char sexo;
  
  //Parametros de datos a recibir
  public void Personal(String nombre, String apellido, int nacimiento, char sexo, String profesion, String departamento, int ingreso, int salario){
  this.nombre = nombre;
  this.apellido = apellido;
  this.nacimiento = nacimiento;
  this.sexo = sexo;
  this.profesion = profesion;
  this.departamento = departamento;
  this.ingreso = ingreso;
  this.salario = salario;
  }
 
  //Metodos o Funciones a devolver
  public String nombreDelTrabajador(){
  String nombreCompleto = nombre + " " + apellido;
  return nombreCompleto;
}
  public int edadDelTrabajador(){
    int edad = 2021 - nacimiento;
    return edad;
  }
  public char generoDelTrabajador(){
    return sexo;
  }
  public String profesionDelTrabajador(){
      return profesion;
  }
  public String departamento(){
      return departamento;
  }
  public int tiempoDeTrabajo(){
      int tiempoEnLaEmpresa = 2021 - ingreso;
      return tiempoEnLaEmpresa;
  }
  public double salarioMensual(){
      return salario;
  }
}