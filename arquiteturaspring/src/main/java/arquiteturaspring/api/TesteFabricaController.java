package arquiteturaspring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arquiteturaspring.model.montadora.Carro;
import arquiteturaspring.model.montadora.CarroStatus;
import arquiteturaspring.model.montadora.Chave;
import arquiteturaspring.model.montadora.Motor;
import arquiteturaspring.model.montadora.Santana;

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
