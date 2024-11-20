public class CuentaCorrienteApp {
    public static void main(String[] args) {
        // Crear dos objetos de tipo CuentaCorriente
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Soraya Garcés");
        CuentaCorriente cuenta2 = new CuentaCorriente("12345678Z", "Aaron Acosta");

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
        System.out.println("Extracción de 200 euros en cuenta de Soraya: " + (exitoExtraccion1 ? "Éxito" : "Fracaso"));

        boolean exitoExtraccion2 = cuenta2.sacarDinero(400.0); // Extracción fallida
        System.out.println("Extracción de 400 euros en cuenta de Aaron: " + (exitoExtraccion2 ? "Éxito" : "Fracaso"));
    }
}
