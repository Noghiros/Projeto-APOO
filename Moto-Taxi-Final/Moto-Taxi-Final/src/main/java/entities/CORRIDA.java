package entities;

import java.util.Calendar;
public class CORRIDA {

    public int getId_corrida() {
        return id_corrida;
    }

    public void setId_corrida(int id_corrida) {
        this.id_corrida = id_corrida;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Calendar getData_hora() {
        return data_hora;
    }

    public void setData_hora(Calendar data_hora) {
        this.data_hora = data_hora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return Tipo_veiculo;
    }

    public void setDescricao(String descricao) {
        this.Tipo_veiculo = descricao;
    }

	private int id_corrida = 0;

	private String endereco;

	private Calendar data_hora;

	private double valor = 10;

	private String Tipo_veiculo;

	public void CreateCorrida() {
            setId_corrida(id_corrida++);
            setData_hora(Calendar.getInstance());
	}

	public void EndCorrida() {
            
	}

}
