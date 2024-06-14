import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cinco cuentas bancarias con titulares y saldos iniciales
        CuentaBancaria[] cuentas = new CuentaBancaria[]{
                new CuentaBancaria("Juan Perez", 1500.00),
                new CuentaBancaria("Ana Lopez", 2500.00),
                new CuentaBancaria("Carlos García", 3000.00),
                new CuentaBancaria("Luisa Morales", 5000.00),
                new CuentaBancaria("Sofia Castro", 4500.00)
        };

        // Menú para seleccionar la cuenta y operar con ella
        while (true) {
            System.out.println("\nSeleccione una cuenta:");
            for (int i = 0; i < cuentas.length; i++) {
                System.out.println((i + 1) + ". Cuenta de " + cuentas[i].getTitular());
            }
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de la cuenta: ");
            int seleccion = scanner.nextInt();

            if (seleccion == 0) {
                System.out.println("Gracias por utilizar nuestro servicio.");
                break;
            } else if (seleccion > 0 && seleccion <= cuentas.length) {
                gestionarCuenta(cuentas[seleccion - 1], scanner);
            } else {
                System.out.println("Selección no válida. Por favor, intente de nuevo.");
            }
        }
        scanner.close();
    }

    private static void gestionarCuenta(CuentaBancaria cuenta, Scanner scanner) {
        while (true) {
            System.out.println("\nGestión de Cuenta Bancaria para " + cuenta.getTitular());
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    System.out.println("El saldo actual de la cuenta es: " + cuenta.obtenerSaldo());
                    break;
                case 4:
                    return;  // Regresa al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
