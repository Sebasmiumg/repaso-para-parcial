public class CuentaBancaria01 {
    private String titular;
    private double saldo;

    // Constructor vacío
    public CuentaBancaria01() {
        this.titular = "Sin titular";
        this.saldo = 0.0;
    }

    // Constructor con titular inicial y saldo inicial
    public CuentaBancaria01(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Constructor con titular inicial (saldo inicial 0 por defecto)
    public CuentaBancaria01(String titular) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Métodos getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: la cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: fondos insuficientes o cantidad no válida.");
        }
    }

    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: " + saldo);
    }
}
