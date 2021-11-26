package clases;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //variables
        String cardNum = "6228123123"; // número de tarjeta
        int pwd = 888888; // contraseña
        
        System.out.println("-----Bienvenido------");
        
         /** Limita el número de inicios de sesion **/
         
        for (int i = 1; i <= 3; i++) {
            
            System.out.println("Por favor inserte su tarjeta bancaria:");
            String tecladoCard = teclado.next();
            System.out.println("Por favor ingrese su contraseña:");
            int tecladoPwd = teclado.nextInt();

            // verificar cuenta y contraseña
            if (tecladoCard.equals(cardNum) && tecladoPwd == pwd) {
                System.out.println("Usted ingreso correctamente...");
                
                //Nota personal de Emilio, esta modificacion fue realizada despues del video. Me fije que asi supere las tres veces avanzaba ahora no :).
                cajeroAutomaticMainClass oConsulta = new consulta();
                oConsulta.setSaldo(200);
                oConsulta.Operaciones();
                break;
            } else {
                if (i <= 2) {
                    System.out.println("Lo siento, la contraseña es incorrecta, aún tienes" + (3 - i) + "¡Segunda oportunidad!");
                } else {
                    System.out.println("Lo siento, tu tarjeta está bloqueada!");
                    break;
                }
            }
        }
    }

}
