package proxecto.proxectobanco;

/**
 *
 * @author profesor
 */
public class Conta {
    protected Persoa titular;
    protected String numero;
    protected float saldo;

    public Conta() {
        titular=null;
        numero=null;
        saldo=1000f;
    }
    public boolean retirar(float valor){
        if (saldo-valor<0)
            return false;
        saldo-=valor;
        return true;
    }
    public void ingresar(float valor){
        saldo+=valor;
    }
}
