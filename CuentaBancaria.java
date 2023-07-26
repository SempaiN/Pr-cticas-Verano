/**
 * Cuentas Bancarias
 */
public class CuentaBancaria {

    String nombre;
    double saldo;

    public boolean retirarDinero(double dinero){
        boolean puc = false;
        double resta= saldo - dinero;
        if (dinero <= 0 && resta > 0) {
            
        }
        return puc;
    }

    
}