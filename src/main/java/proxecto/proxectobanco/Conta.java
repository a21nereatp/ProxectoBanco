package proxecto.proxectobanco;

/**
 *
 * @author Nerea Trillo
 */
public class Conta {

    /**
     * Define a variable titular
     */
    protected Persoa titular;

    /**
     * Define as variables numero y saldo
     */
    protected String numero;
    private float saldo;

    /**
     * Define o construtor Conta
     */
    public Conta() {
        titular=null;
        numero=null;
        saldo=1000f;
    }

    /**
     *
     * @param valor
     * @return expresión booleana: verdadeiro ou falso
     */
    public boolean retirar(float valor){
        if (getSaldo()-valor<0)
            return false;
        setSaldo(getSaldo() - valor);
        return true;
    }
    
    /**
     *
     * @param valor para o método ingresar
     */
    public void ingresar(float valor){
        setSaldo(getSaldo() + valor);
    }
    
    /**
     *
     * @param valor para o método inicializarSaldo
     */
    public void inicializarSaldo(float valor){ 
        this.saldo=0.00f; 
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
