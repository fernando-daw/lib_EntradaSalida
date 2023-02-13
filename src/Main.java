public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Mensaje en una ventana", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");

        EntradaSalida.letras("Introduce el mensaje que quieras");
        EntradaSalida.numero("Introduce el numero entero que quieras");

        EntradaSalida.calculadora(5,6,suma);

    }
}