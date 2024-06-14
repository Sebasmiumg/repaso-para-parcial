public class Main01 {
    public static void main(String[] args) {
        // Ejemplo de uso de los constructores y métodos
        CuentaBancaria01 cuenta1 = new CuentaBancaria01();
        cuenta1.mostrarInformacion();  // Mostrará el titular y saldo por defecto

        CuentaBancaria01 cuenta2 = new CuentaBancaria01("Juan Pérez", 500);
        cuenta2.mostrarInformacion();  // Mostrará el titular y saldo inicializado

        CuentaBancaria01 cuenta3 = new CuentaBancaria01("María López", 1500.0);
        cuenta3.mostrarInformacion();  // Mostrará el titular y saldo inicializado

        CuentaBancaria01 cuenta4 = new CuentaBancaria01("Lulo Melano",500);
        cuenta4.mostrarInformacion();  // Mostrará el titular y saldo inicializado

        // Realizar operaciones
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);
        cuenta1.mostrarInformacion();

        cuenta2.depositar(1000.0);
        cuenta2.mostrarInformacion();

        cuenta3.depositar(1500.00);
        cuenta3.retirar(3000.0);

    }
}
