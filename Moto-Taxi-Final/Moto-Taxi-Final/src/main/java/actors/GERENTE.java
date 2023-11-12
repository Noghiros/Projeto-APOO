package actors;

import entities.REGISTRO;

public class GERENTE extends PESSOA {

    public String getDiploma() {
        return Diploma;
    }

    public void setDiploma(String Diploma) {
        this.Diploma = Diploma;
    }

    public REGISTRO[] getRegistro() {
        return Registro;
    }

    public void setRegistro(REGISTRO[] Registro) {
        this.Registro = Registro;
    }

	private String Diploma;

	private REGISTRO[] Registro;

	public int ConsultaCliente() {
		return 0;
	}

	public int ConsultaMotorista() {
		return 0;
	}

	public int ConsultaMecanico() {
		return 0;
	}

	public void RegistraMotorista() {

	}

	public void RegistraMecanico() {

	}

	public void ApagaMotorista() {

	}

	public void ApagaMecanico() {

	}

}
