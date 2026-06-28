package arquiteturaspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import arquiteturaspring.enuns.TipoMotor;
import arquiteturaspring.model.Motor;

@Configuration
public class MontadoraConfiguration {
	
	@Bean
	public Motor motor() {
		Motor motor = new Motor();
		motor.setCavalo("123cv");
		motor.setCilindro(4);
		motor.setModelo("standard");
		motor.setTipoMotor(TipoMotor.AP);
		return motor;
	}

}
