package arquiteturaspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import arquiteturaspring.enuns.TipoMotor;
import arquiteturaspring.model.montadora.Motor;

@Configuration
public class MontadoraConfiguration {
	
	@Bean(name = "motorAp")
	public Motor motorAp() {
		Motor motor = new Motor();
		motor.setCavalo("123cv");
		motor.setCilindro(4);
		motor.setModelo("standard");
		motor.setTipoMotor(TipoMotor.AP);
		return motor;
	}
	
	@Bean(name = "motorEletrico")
	public Motor motorEletrico() {
		Motor motor = new Motor();
		motor.setCavalo("150cv");
		motor.setCilindro(4);
		motor.setModelo("BYD");
		motor.setTipoMotor(TipoMotor.ELETRICO);
		return motor;
	}
	@Bean(name = "motortresCilindros")
	public Motor motorTresCilindros() {
		Motor motor = new Motor();
		motor.setCavalo("123cv");
		motor.setCilindro(4);
		motor.setModelo("standard");
		motor.setTipoMotor(TipoMotor.TRES_CILINDROS);
		return motor;
	}
	@Bean(name = "motorTurbo")
	public Motor motorTurbo() {
		Motor motor = new Motor();
		motor.setCavalo("123cv");
		motor.setCilindro(4);
		motor.setModelo("standard");
		motor.setTipoMotor(TipoMotor.TURBO);
		return motor;
	}

}
