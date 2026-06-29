package arquiteturaspring.model.montadora;

import java.awt.Color;

import arquiteturaspring.enuns.Montadora;

public class Santana extends Carro {

	public Santana(Motor motor) {
		super(motor);
		setColor(Color.BLUE);
		setMontadora(Montadora.volkswagen);
		setTipo("sedan");
	}

}
