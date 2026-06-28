package arquiteturaspring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import arquiteturaspring.model.Carro;
import arquiteturaspring.model.Chave;
import arquiteturaspring.model.Motor;
import arquiteturaspring.model.Santana;

@RestController
public class TesteFabricaController {
	
	@Autowired
	private Motor motor; 
	
	@PostMapping
	public void ligar(@RequestBody Chave chave) {
		Carro carro = new Santana(motor);
	}

}
