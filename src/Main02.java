import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Vehiculo vehiculo01 = new Vehiculo("Toyota", "BZ454839", 2024);

        // Menú para interactuar con el vehículo.
        while (true) {
            System.out.println("\nMenú de Gestión de Vehículo:");
            System.out.println("1. Cambiar modelo del vehículo");
            System.out.println("2. Cambiar año del vehículo");
            System.out.println("3. Mostrar información del vehículo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner.

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nuevo modelo del vehículo: ");
                    String nuevoModelo = scanner.nextLine();
                    vehiculo01.setModelo(nuevoModelo);
                    break;
                case 2:
                    System.out.print("Ingrese el nuevo año del vehículo: ");
                    int nuevoAño = scanner.nextInt();
                    vehiculo01.setAño(nuevoAño);
                    break;
                case 3:
                    vehiculo01.mostrarInformacion();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

