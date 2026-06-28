package arquiteturaspring.model;

import java.awt.Color;

import arquiteturaspring.enuns.Montadora;

public class Carro {
	private String tipo;
	private Color color;
	private Motor motor;
	private Montadora montadora;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Montadora getMontadora() {
		return montadora;
	}
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
	public Carro(Motor motor) {
		super();
		this.motor = motor;
	}
	
	
	
}
