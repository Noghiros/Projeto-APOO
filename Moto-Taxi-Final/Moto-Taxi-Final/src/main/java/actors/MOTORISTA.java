package actors;


public class MOTORISTA extends PESSOA {

	private String placa;

	private int cnh;

	private String modelo;

	public int ConsultaCliente() {
                
		return 0;
	}

	public int PedeConserto() {
		return 0;
	}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
