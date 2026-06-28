package arquiteturaspring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arquiteturaspring.model.Carro;
import arquiteturaspring.model.CarroStatus;
import arquiteturaspring.model.Chave;
import arquiteturaspring.model.Motor;
import arquiteturaspring.model.Santana;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {
	
	@Autowired
	@Qualifier("motorTurbo")
	private Motor motor; 
	
	@PostMapping
	public CarroStatus ligar(@RequestBody Chave chave) {
		Carro carro = new Santana(motor);
		return carro.darIgnicao(chave);
	}

}
