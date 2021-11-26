package clases;


public class deposito extends cajeroAutomaticMainClass {
    
    @Override
    public void Transacciones(){
        System.out.println("Ingrese monto de deposito: ");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("--------------Recibo------------");
        System.out.println("Depositaste " + deposito);
        System.out.println("Saldo actual: " + getSaldo());
        System.out.println("--------------------------------");
    }
    
}
