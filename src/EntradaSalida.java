import javax.swing.*;
import java.util.Scanner;

/**
 * Libreria para sacar por dispositivos un mensaje y
 * pedir por consola distintos tipos de datos
 * @version 0.1
 * @author Fernando Lago
 */
public class EntradaSalida {
    /**
     * opción de uso de la consola para imprimir un mensaje
     */
    public static final int SALIDA_CONSOLA = 1;
    /**
     * opción de uso de utilizar una ventana en el escritorio para sacar un mensaje
     */
    public static final int SALIDA_WINDOW = 2;

    private void EntradaSalida(){};

    /**
     * Salida por ventana o consala de un mensaje
     * @param msj cadena que queremos imprimir
     * @param device dispositivo de salida<br>consola: SALIDA_CONSOLA<br>ventana:SALIDA_VENTANA
     * @return si es true: correcto si no false
     */
    public static boolean salida(String msj, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null,"Sale por un ventana " + msj);
                    return true;
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            default:
                return false;
        }
    }

    /**
     * TODO método para obtener distintos tipos de datos por consola
     * @param palabras para el mensaje del usuario
     * @return si es true, sino false
     */
    public static boolean numero(String palabras){
        Scanner pedir = new Scanner(System.in);
        int numero;
        try{
            System.out.println(palabras);
            numero = pedir.nextInt();
            System.out.println("el numero que has introducido es " + numero);
            return true;
        }
        catch (Exception e){
            System.out.println("No has introducido un numero, pusiste lo que te dio la gana menos eso");
            return false;
        }

    }
    public static boolean letras(String palabras){
        Scanner pedir = new Scanner(System.in);
        String cosa="";
        try{
            System.out.println(palabras);
            cosa = pedir.nextLine();
            System.out.println("el mensaje que has introducido es " + cosa);
            return true;
        }
        catch (Exception e){
            System.out.println("No has introducido un mensaje, pusiste lo que te dio la gana menos eso");
            return false;
        }

    }

    public static int calculadora (float num1,float num2, char operacion ){
        Scanner pedir = new Scanner(System.in);
        char suma = 0;
        char resta = 0;
        char multiplicacion = 0;
        char division = 0;

        float numero1;
        float numero2;
        float resultado = 0;
        System.out.println("Primer numero");
        numero1 = pedir.nextFloat();
        System.out.println("Segundo numero");
        numero2 = pedir.nextFloat();
        switch (operacion){

            case suma:
                resultado = numero1 + numero2;
                break;
            case resta:
                resultado = numero1-numero2;
                break;
            case multiplicacion:
                resultado = numero1*numero2;
                break;
            case division:
                resultado= numero1/numero2;
                break;
            default:
                System.out.println("No has introducido una opcion correcta");

        }

        return (int) resultado;
    }


}
