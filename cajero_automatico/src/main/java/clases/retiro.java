
package clases;

public class retiro extends cajeroAutomaticMainClass {
    
    @Override
    public void Transacciones() {
        System.out.print("Cuanto desea retirar: ");
        Retiro();
        //Para saber si hay saldo
        if(retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
