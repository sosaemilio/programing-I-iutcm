package clases;

import java.util.Scanner;

public abstract class cajeroAutomaticMainClass {
    
    //Objetos y variables
    Scanner teclado = new Scanner(System.in);
    protected double transacciones;
    protected double retiro, deposito;
    private static double saldo;
    
    //Metodo para las Operaciones
    public void Operaciones(){
        
    //Variables
    int flag = 0;
    int menuActual = 0;

    //Menu
        do{
            //Menu pero en texto
            do {
            System.out.println("Menu de Opciones, seleccione un numero: ");
            System.out.println("    1. Deposito");
            System.out.println("    2. Retiro");
            System.out.println("    3. Consulta de Saldo");
            System.out.println("    4. Salir");
            menuActual = teclado.nextInt();

            //Condicion, permite salir del menu
            if (menuActual >= 1 && menuActual <= 4) {
                flag = 1;
            } else {
                System.out.println("-------------------");
                System.out.println("Intente nuevamente");
                System.out.println("-------------------");
            }
        } while (flag == 0);

        switch (menuActual) {
            case 1:
                cajeroAutomaticMainClass oDeposito = new deposito();
                oDeposito.Transacciones();
                break;
            case 2:
                cajeroAutomaticMainClass oRetiro = new retiro();
                oRetiro.Transacciones();
                break;
            case 3:
                cajeroAutomaticMainClass oConsulta = new consulta();
                oConsulta.Transacciones();
                break;
            case 4:
                System.out.println("Usted ha salido exitosamente, gracias...");
                flag = 2;
                break;
        }
    }while(flag != 2);
    }
    
    //Metodo para retito
    public void Retiro(){
        retiro = teclado.nextDouble();       
    }
    
    //Metodo para deposito
    public void Deposito(){
        deposito = teclado.nextDouble();
    }
    
    //Metodo abstracto
    public abstract void Transacciones();
    
    //Metodos set y get
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
