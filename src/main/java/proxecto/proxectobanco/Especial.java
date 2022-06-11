package proxecto.proxectobanco;

/**
 *
 * @author profesor
 */
public class Especial extends Conta{
    private float limite;
    public Especial(){
        super();
        limite=0.00f;
    }
    public boolean retirar(float valor){
        if (getSaldo()-valor<0)
            if ((getSaldo()-valor)*-1>limite)
                return false;
        setSaldo(getSaldo() - valor);
        return true;
    }
}
