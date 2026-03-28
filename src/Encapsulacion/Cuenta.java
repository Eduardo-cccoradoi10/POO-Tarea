package Encapsulacion;

public class Cuenta {
	
	private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("No se puede retirar: saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: Q" + saldo);
    }
    
}
