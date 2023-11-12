package controllers;

import actors.CLIENTE;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controle_Registro_Cliente {
    private CLIENTE c;
    private List<CLIENTE> Bdcli = new ArrayList<CLIENTE>();
    
    public List<CLIENTE> getBdcli(){
        return Bdcli;
    }
    
    public CLIENTE registraCliente(CLIENTE c){
        if(consCliCpf(c)== null){
            Bdcli.add(c);
            return c;
	}else{
            return null;
	}
    }
    
    public CLIENTE consCliCpf(CLIENTE c){
	for(int i = 0; i < Bdcli.size(); i++){
            if(c.getCpf() == Bdcli.get(i).getCpf()){
		return Bdcli.get(i);
            }
        }
	return null;
    }
    
   public CLIENTE removeCliCpf(CLIENTE c){
        c = consCliCpf(c);
        if(c != null){
            Bdcli.remove(c);
            return null;
	}else{
            return c;
	}
    }
    public CLIENTE atualizaJogCpf(CLIENTE c){
	for(int i = 0; i < Bdcli.size(); i++){
            if(c.getCpf() == Bdcli.get(i).getCpf()){
                    String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    c.setNome(nome);
		Bdcli.set(i, c);
                    String email= JOptionPane.showInputDialog(null, "Informe o NOVO email", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    c.setEmail(email);
		Bdcli.set(i, c);
                    String senha = JOptionPane.showInputDialog(null, "Informe a NOVA senha", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    c.setSenha(senha);
		Bdcli.set(i, c);
                    String telefone = JOptionPane.showInputDialog(null, "Informe o NOVO telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    c.setTelefone(telefone);
		Bdcli.set(i, c);
                return Bdcli.get(i);
            }
        }
        return null;
    }
}
