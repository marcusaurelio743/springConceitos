package arquiteturaspring.model;

import arquiteturaspring.enuns.TipoMotor;

public class Motor {
	private String modelo;
	private String cavalo;
	private Integer cilindro;
	private Double litragem;
	private TipoMotor tipoMotor;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCavalo() {
		return cavalo;
	}

	public void setCavalo(String cavalo) {
		this.cavalo = cavalo;
	}

	public Integer getCilindro() {
		return cilindro;
	}

	public void setCilindro(Integer cilindro) {
		this.cilindro = cilindro;
	}

	public Double getLitragem() {
		return litragem;
	}

	public void setLitragem(Double litragem) {
		this.litragem = litragem;
	}

	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

}
