import javax.swing.*;

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
     * @param comentario
     * @return
     */
    public static String entrada(String comentario){
        return "";
    }
}
