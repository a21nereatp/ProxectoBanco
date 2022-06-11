package proxecto.proxectobanco;

/**
 *
 * @author profesor
 */
public class Conta {
    protected Persoa titular;
    protected String numero;
    private float saldo;

    public Conta() {
        titular=null;
        numero=null;
        saldo=1000f;
    }
    public boolean retirar(float valor){
        if (getSaldo()-valor<0)
            return false;
        setSaldo(getSaldo() - valor);
        return true;
    }
    public void ingresar(float valor){
        setSaldo(getSaldo() + valor);
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
