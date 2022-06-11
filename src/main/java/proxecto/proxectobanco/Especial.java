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
        if (saldo-valor<0)
            if ((saldo-valor)*-1>limite)
                return false;
        saldo-=valor;
        return true;
    }
}
