public class CuentaCorrienteApp {
    public static void main(String[] args) {
        // Crear dos objetos de tipo CuentaCorriente
        CuentaCorriente cuenta1 = new CuentaCorriente("87654321B", "Papá Noel de Arriba");
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321Y", "Reno Rudolf");

        // Realizar ingresos en las cuentas
        System.out.println("\nIngresos en las cuentas corrientes: ");
        cuenta1.ingresarDinero(500.0);
        cuenta2.ingresarDinero(300.0);

        // Mostrar información de las cuentas
        System.out.println("\nInformación de las cuentas:");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();

        // Intentar extraer dinero de las cuentas
        System.out.println("\nIntentando extracciones:");
        boolean exitoExtraccion1 = cuenta1.sacarDinero(200.0); // Extracción exitosa
        System.out.println("Extracción de 200 euros en cuenta de Papá Noel de Arriba: " + (exitoExtraccion1 ? "Éxito" : "Fracaso"));

        boolean exitoExtraccion2 = cuenta2.sacarDinero(400.0); // Extracción fallida
        System.out.println("Extracción de 400 euros en cuenta de Reno Rudolf: " + (exitoExtraccion2 ? "Éxito" : "Fracaso"));
    }
}
