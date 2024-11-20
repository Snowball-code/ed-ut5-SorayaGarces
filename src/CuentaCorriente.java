public class CuentaCorriente {
    private String dni;
    private String nombreTitular;
    private double saldo;

    // Constructor parametrizado que recibirá 2 parámetros
    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0.0; // Saldo inicial es 0
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingreso realizado: " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva.");
        }
    }

    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Extracción realizada: " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
            return true;
        } else {
            System.out.println("\nOperación fallida: saldo insuficiente o cantidad no válida.");
            return false;
        }
    }

    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular + " \tDNI: " + dni + " \tSaldo: " + saldo + " euros");
    }
}

