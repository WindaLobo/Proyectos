package boletin16;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(long numeroCuenta, Persona cliente, double saldo) {
        super(numeroCuenta, cliente, saldo * 0.985);

    }


    public CuentaCorriente() {
    }
    


}
