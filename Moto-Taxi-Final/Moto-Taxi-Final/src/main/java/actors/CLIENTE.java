package actors;

import entities.CORRIDA;
import entities.REGISTRO;
import java.util.Date;

public class CLIENTE extends PESSOA {
    
    private CORRIDA[] CORRIDA;

    private REGISTRO REGISTRO;
    

    public void PedeCorrida() {

    }

    public CORRIDA[] getCORRIDA() {
        return CORRIDA;
    }

    public void setCORRIDA(CORRIDA[] CORRIDA) {
        this.CORRIDA = CORRIDA;
    }

    public REGISTRO getREGISTRO() {
        return REGISTRO;
    }

    public void setREGISTRO(REGISTRO REGISTRO) {
        this.REGISTRO = REGISTRO;
    }

}
