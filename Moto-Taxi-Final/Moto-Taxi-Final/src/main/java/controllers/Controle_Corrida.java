package controllers;

import entities.CORRIDA;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controle_Corrida {
    private CORRIDA c;
    private List<CORRIDA> Bdcor = new ArrayList<CORRIDA>();
    
    public List<CORRIDA> getBdcli(){
        return Bdcor;
    }
    
    public CORRIDA iniciaCorrida(CORRIDA c){
        if(consIdCorrida(c)== null){
            Bdcor.add(c);
            return c;
	}else{
            return null;
	}
    }
    
    public CORRIDA consIdCorrida(CORRIDA c){
	for(int i = 0; i < Bdcor.size(); i++){
            if(c.getId_corrida() == Bdcor.get(i).getId_corrida()){
		return Bdcor.get(i);
            }
        }
	return null;
    }
    
   public CORRIDA removeCliCpf(CORRIDA c){
        c = consIdCorrida(c);
        if(c != null){
            Bdcor.remove(c);
            return null;
	}else{
            return c;
	}
    }
}
