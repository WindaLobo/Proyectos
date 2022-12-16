package boletin16;

import javax.swing.JOptionPane;

public class Cuenta {

    long numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(long numeroCuenta, Persona cliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public double Ingresar() {
int pregunta=JOptionPane.showConfirmDialog(null,"Quieres ingresar saldo?");
            if (pregunta==0) {
                double ing=Double.parseDouble(JOptionPane.showInputDialog("ingrese monto a ingresar:"));
                saldo = saldo + ing;
            }
            return saldo;
    }

    public double Retirar() {
        int persona = JOptionPane.showConfirmDialog(null, "Quieres retirar?");
        if (persona <= 0) {

            double ret = Double.parseDouble(JOptionPane.showInputDialog("ingrese monto a retirar:"));
            saldo -= ret;
        }
        return saldo;
    }

    public void actualizarSaldo() {
        JOptionPane.showMessageDialog(null, "Su saldo actual es: "
                + saldo + " €");
    }

    @Override
    public String toString() {
        return " numeroCuenta = " + numeroCuenta + "\n saldo = " + saldo + "\n  cliente = " + cliente;
    }

}
