package controllers;

import actors.MOTORISTA;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controle_Registro {
    private MOTORISTA mot;
    private List<MOTORISTA> Bdmot = new ArrayList<MOTORISTA>();
    
    public List<MOTORISTA> getBdmot(){
        return Bdmot;
    }
    
    public MOTORISTA registraMotorista(MOTORISTA mot){
        if(consMotCpf(mot)== null){
            Bdmot.add(mot);
            return mot;
	}else{
            return null;
	}
    }
    
    public MOTORISTA consMotCpf(MOTORISTA mot){
	for(int i = 0; i < Bdmot.size(); i++){
            if(mot.getCpf() == Bdmot.get(i).getCpf()){
		return Bdmot.get(i);
            }
        }
	return null;
    }
    
   public MOTORISTA removeMotCpf(MOTORISTA mot){
        mot = consMotCpf(mot);
        if(mot != null){
            Bdmot.remove(mot);
            return null;
	}else{
            return mot;
	}
    }
    public MOTORISTA atualizaMotCpf(MOTORISTA mot){
	for(int i = 0; i < Bdmot.size(); i++){
            if(mot.getCpf() == Bdmot.get(i).getCpf()){
                    String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    mot.setNome(nome);
		Bdmot.set(i, mot);
                    String email= JOptionPane.showInputDialog(null, "Informe o NOVO email", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    mot.setEmail(email);
		Bdmot.set(i, mot);
                    String senha = JOptionPane.showInputDialog(null, "Informe a NOVA senha", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    mot.setSenha(senha);
		Bdmot.set(i, mot);
                    String telefone = JOptionPane.showInputDialog(null, "Informe o NOVO telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    mot.setTelefone(telefone);
		Bdmot.set(i, mot);
                    String placa = JOptionPane.showInputDialog(null, "Informe a NOVA placa da moto", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    mot.setPlaca(placa);
		Bdmot.set(i, mot);
                    String cnh = JOptionPane.showInputDialog(null, "Informe a NOVA CNH", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    mot.setCnh(Integer.parseInt(cnh));
		Bdmot.set(i, mot);
                    String modelo= JOptionPane.showInputDialog(null, "Informe o NOVO nome no cartão", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    mot.setModelo(modelo);
		Bdmot.set(i, mot);
                return Bdmot.get(i);
            }
	}
        
        return null;}
    
    }
    
