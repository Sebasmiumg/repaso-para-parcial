public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado exitosamente. Saldo actual: " + saldo);
        } else {
            System.out.println("Cantidad a depositar debe ser positiva");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro realizado exitosamente. Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
